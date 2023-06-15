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
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}