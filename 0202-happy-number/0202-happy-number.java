class Solution {
    public boolean isHappy(int n) {
        if (n == 1) { return true; }
        int slow = n, fast = n;
        while (true) {
            slow = happy(slow);
            fast = happy(happy(fast));
            if (slow == fast) break;
        }
        return slow == 1;
    }
    public int happy(int n) {
        char[] c = Integer.toString(n).toCharArray();
        int mul=1, sum=0;
        for(int i=0; i<c.length; i++) {
            mul = (c[i] - '0')*(c[i] - '0');
            sum += mul;
        }
        return sum;
    }
}