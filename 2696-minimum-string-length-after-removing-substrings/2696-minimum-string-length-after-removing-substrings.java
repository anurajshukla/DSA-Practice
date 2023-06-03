class Solution {
    public int minLength(String s) {
        Stack<Character> a = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!a.isEmpty() && a.peek() == 'A' && c == 'B' || !a.isEmpty() && a.peek() == 'C' && c == 'D') { 
                a.pop(); 
            }
            else { a.push(c); }
        }
        return a.size();
    }
}