class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num != revNum(revNum(num))) {
            return false;
        }
        return true;
    }
    public int revNum(int num) {
        int rev=0, a=0, n=num;
        while(n!=0) {
            a = n%10;
            rev = rev*10 + a;
            n/=10;
        }
        return rev;
    }
}