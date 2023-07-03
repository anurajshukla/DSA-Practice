class Solution {
    public String reverseWords(String s) {
        String [] str = s.trim().split("\\s+");
        int st=0, e=str.length-1;
        while(st <= e) {
            String temp = str[st];
            str[st] = str[e];
            str[e] = temp;
            st++; e--;
        }
        String ans = "";
        for(int i=1; i<str.length; i++) {
            ans += " " + str[i];
        }
        return str[0] + ans;
    }
}