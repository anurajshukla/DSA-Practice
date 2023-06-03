class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String n = "+-/*";
        for(String a : tokens) {
            if(n.contains(a) && !s.isEmpty()) {
                int b = s.pop();
                int c = s.pop();
                int f = operation(b, c, a);
                s.push(f);
            }
            else {
                s.push(Integer.parseInt(a));
            }
        }
        return s.pop();
    }
    public int operation(int b, int c, String a) {
        if(a.equals("+")) return c+b;
        else if(a.equals("-")) return c- b;
        else if(a.equals("/")) return c/b;
        return c*b;
        }
}