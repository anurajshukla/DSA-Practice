class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) { stack.pop(); }
            else {stack.add(c); }
        }
        String st = "";
        while(!stack.isEmpty()) {
            st = stack.pop() + st;
        }
        return st;
    }
}