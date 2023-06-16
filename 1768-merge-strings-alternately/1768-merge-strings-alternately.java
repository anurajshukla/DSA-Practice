class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int count=0;
        int max = Math.max(word1.length(), word2.length());
        while(count < max) {
            if(count < word1.length()) { s += word1.charAt(count); }
            if(count < word2.length()){ s+= word2.charAt(count); }
            count++;
        }
        return s;
               
    }
}