class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        
        int l = fib(n-1);
        int s = fib(n-2);
        
        return l + s;
    }
}