class Solution {
    public String decodeString(String s) {
        Stack<String> chars = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ']') { 
                int n = nums.pop(); 
                String ch = chars.pop();
                String a = "";
                while(!ch.equals("[")) {
                    a = ch + a;
                    ch = chars.pop();
                }
                String b = "";
                while(n > 0) {
                    b = b + a;
                    n--;
                }
                chars.push(b);
            }
            else if(Character.isDigit(s.charAt(i))){
                int st = i, e = s.indexOf('[', i);
                nums.push(Integer.parseInt(s.substring(st, e)));
                i = e - 1;
            }
            else{
                chars.push(String.valueOf(s.charAt(i)));
            }
        }
        String result="";
         while(!chars.empty()){
            result = chars.pop() + result;
         }
        return result;
    }
}