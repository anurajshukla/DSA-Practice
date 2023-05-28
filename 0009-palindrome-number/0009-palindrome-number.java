class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;
        while (y > 0) {
            int r = y % 10;
            rev = rev * 10 + r;
            y = y / 10;
        }
        if (x == rev) {
            return true;
            } 
        else {
            return false;
        }
    }
}