class Solution {
    public int countOperations(int num1, int num2) {
        int op =0;
        if(num1>0 && num2 >0) {
            while(true){
                if(num1 == num2) { op++; return op;}
                op++;
                if(num1 >= num2) { num1-= num2; }
                else {num2-=num1; }
            }
        }
        return op;
    }
}