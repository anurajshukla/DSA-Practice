class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--) {
            // to find greater element in than temperatures[i] in the stack
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            // found the greater element and adding diff to ans array
            if(!stack.isEmpty()) { 
                ans[i]= stack.peek() - i; 
            }
            // pushing the index of temperatures[i] to stack
            stack.push(i);
        }
        return ans;
    }
}