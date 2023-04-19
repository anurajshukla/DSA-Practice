class Solution {
    public int mySqrt(int x) {
        long e=x, s=0, mid=0;
        while(e>=s) {
            mid = s + (e-s)/2;
            if(mid*mid > x) { e = mid -1; }
            else if(mid*mid < x) { s = mid + 1;} 
            else { return (int) mid;}
        }
        return (int) e;
    }
}