class Solution {
    public boolean isValid(String s) {
        if(s.length() %2!= 0 ) { return false; }
        Stack<Character> a = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='(' || c=='{' || c=='[') { a.push(c); }
            else { 
                if(a.isEmpty()) { return false; }
                else {
                    char top = a.peek();
                    if(c==')' && top == '(' || c=='}' && top == '{' || c==']' && top == '[') { a.pop(); }
                    else { return false; }
                }
            }
        }
        return a.isEmpty();
        
    }
}