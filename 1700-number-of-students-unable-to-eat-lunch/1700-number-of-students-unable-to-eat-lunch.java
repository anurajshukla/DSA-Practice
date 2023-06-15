class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i : students) { queue.offer(i); }
        for(int i = sandwiches.length-1; i>=0; i--) {
            stack.push(sandwiches[i]); 
        }
        int c = stack.size() * queue.size();
        while(c-- > 0) {
            if(!stack.isEmpty() && stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
            }
            else {
                if(queue.size() > 0) { queue.offer(queue.remove()); }
                else { return 0; }
            }
        }
        return queue.size();
    }
}