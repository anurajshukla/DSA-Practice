class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax =0, currMin =0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int totalSum =0;
        for(int i : nums) {
            totalSum += i;
            currMax += i;
            currMin += i;
            max = Math.max(max, currMax);
            if(currMax < 0) currMax = 0;
            min = Math.min(min, currMin);
            if(currMin > 0) currMin = 0;
        }
        if(totalSum == min) return  max;
        return Math.max(max, totalSum - min);
    }
}