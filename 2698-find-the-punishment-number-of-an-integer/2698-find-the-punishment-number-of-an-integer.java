class Solution {
    public int punishmentNumber(int n) {
        int s=0, sum=0;
        for(int i=0; i<=n; i++) {
            s = i*i;
            if(isPunish(s, i)) { sum +=s; } 
        }
        return sum;
    }
    boolean isPunish(int sqr, int num) {
        if(num<0 || sqr<num) { return false; }
        else if(sqr == num) { return true; }
        return isPunish(sqr/10,num-sqr%10)||isPunish(sqr/100,num-sqr%100)||isPunish(sqr/1000,num-sqr%1000);
    }
}