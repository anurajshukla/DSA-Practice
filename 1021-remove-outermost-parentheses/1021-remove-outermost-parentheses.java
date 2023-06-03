class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> a = new Stack<>();
        StringBuilder st = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(a.isEmpty() && c=='(') { a.push('('); }
            else if(!a.isEmpty() && c=='(') { a.push(c); st.append(c); }
            else if(a.size() >1 && c==')') { a.pop(); st.append(c); }
            else if(a.size()==1 && c==')') { a.pop(); }
        }
        return st.toString();
    }
}