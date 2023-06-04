class Solution {
    public String longestPalindrome(String s) {
        int left=0, right=0;
        for(int i=0; i<s.length(); i++) {
            int odd = Palindrome(s, i, i);
            int even = Palindrome(s, i, i+1);
            int max = Math.max(odd, even);
            
            if(max> (right-left)) { left= i-(max-1)/2; right = i+ max/2; }
        }
        return s.substring(left, right+1);
    }
    
    public int Palindrome(String s, int left, int right) {
        while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)) {
            left--; right++;
        }
        return right-left-1;
    }
}