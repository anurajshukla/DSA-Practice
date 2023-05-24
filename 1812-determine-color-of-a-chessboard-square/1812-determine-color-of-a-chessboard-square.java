class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0) - 'a' + 1;
        int b = coordinates.charAt(1) - '0';
        if ((a+b) % 2 == 0) { 
            return false;
        }
        return true;
    }
}