class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char [] c = s.toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] == '*') { stack.pop();}       
            else { stack.push(c[i]); }
        }
        StringBuilder sb = new StringBuilder();
        for(int i= stack.size()-1; i>=0; i-- ) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}