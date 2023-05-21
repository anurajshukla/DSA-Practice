class Solution {
    public int countDigits(int num) {
        int count = 0, a = 0, n = num;
        while (n != 0) {
            a = n % 10;
            if (num % a == 0) {
                count++;
            }
            n/= 10;
        }
        return count;
    }
}