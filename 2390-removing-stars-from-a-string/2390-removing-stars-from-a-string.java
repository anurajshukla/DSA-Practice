class Solution {
    public String removeStars(String s) {
        char a[] = new char[s.length()];
        int index =0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '*') { index--;}
            else{ a[index++] = s.charAt(i);}
        }
        return new String(a, 0, index);
    }
}