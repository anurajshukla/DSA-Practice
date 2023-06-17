class Solution {
    public int compress(char[] chars) {
        if(chars.length ==1) { return 1; }
        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        int count=1;
        for(int i=1; i<chars.length; i++) {
            if(chars[i] == chars[i-1]) { count++; }
            else { 
                if(count > 1){ s.append(count); count=1;} 
                s.append(chars[i]); 
            }
        }
        if(count > 1) {
            s.append(count);
        }
        String st = s.toString();
        for(int i=0; i<st.length(); i++) {
            chars[i] = st.charAt(i);
        }
        return st.length();
    }
}