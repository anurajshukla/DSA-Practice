class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0, e=letters.length-1;
        char a = letters[0];
        while(e>=s) {
            int mid = s + (e-s)/2;
            if(letters[mid] == target || target> letters[mid]) {
                s = mid + 1;
            }
            else if(letters[mid] > target) {
                a = letters[mid];
                e = mid-1;
            }
        }
        return a;
    }
}