class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2))
            return "0";
        
        int[] num = new int[num1.length() + num2.length() -1];
        
        for(int i=0; i<num1.length(); i++) {
            for(int j=0; j<num2.length(); j++) {
                num[i+j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        
        for(int i=num.length-1 ; i>0; i--) {
            num[i-1] += (num[i]/10);
            num[i] %=10;
        }
        
        StringBuilder s = new StringBuilder();
        for(int i : num) {
            s.append(i);
        }
        
        return s.toString();
    }
}