class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1, e=num;
        while(e>=s) {
            long mid= s + (e-s)/2;
            if(mid*mid < num) { s = (int) mid+1;}
            else if(mid*mid > num) { e = (int) mid -1; }
            else { return true;}
        }
        return false;
    }
}