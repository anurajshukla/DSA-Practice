class Solution {
    public int[] divisibilityArray(String word, int m) {
        int [] res = new int[word.length()];
        long ans =0;
        for(int i=0; i<word.length(); i++) {
            long c = word.charAt(i) - '0';
            ans = (ans*10 + c)%m;
            if(ans == 0) { res[i] = 1; }
        }
        return res;
    }
}