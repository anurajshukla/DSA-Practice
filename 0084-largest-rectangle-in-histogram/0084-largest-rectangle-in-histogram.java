class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max=0, n=heights.length;
        for(int i=0; i<n; i++) {
            while((stack.peek() != -1) && (heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        while(stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = n - stack.peek() - 1;
            max = Math.max(max, height * width);
        }
        return max;                                  
    }
}