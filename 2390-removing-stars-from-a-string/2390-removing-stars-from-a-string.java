class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char [] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] == '*') { stack.pop(); }
            else { stack.push(c[i]); }
        }
        StringBuilder st = new StringBuilder();
        for( char ch : stack ) {
            st.append(ch);
        }
        return st.toString();
    }
}