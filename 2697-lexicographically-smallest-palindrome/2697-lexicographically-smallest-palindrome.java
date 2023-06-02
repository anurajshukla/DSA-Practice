class Solution {
    public String makeSmallestPalindrome(String s) {
        char [] c = s.toCharArray();
        int n = c.length;
        for(int i=0; i<n/2; i++) {
            if(c[i] != c[n-i-1]) { 
                if(c[i]-'a' < c[n-i-1]-'a') {
                    c[n-i-1] = c[i];
                }
                else {
                    c[i] = c[n-i-1];
                }
            }
        }
        String a = "";
        for(int i=0; i<c.length; i++) {
            a+=c[i];
        }
        return a;
    }
}