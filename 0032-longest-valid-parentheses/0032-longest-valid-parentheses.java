class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> a = new Stack<>();
        int max=0, b=-1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') { a.push(i); }
            else {
                if(a.isEmpty()) { b=i; }
                else {
                    a.pop();
                    if(a.isEmpty()) { max = Math.max(max, i-b); }
                    else { max = Math.max(max, i-a.peek()); }
                }
            }
        }
        return max;
    }
}