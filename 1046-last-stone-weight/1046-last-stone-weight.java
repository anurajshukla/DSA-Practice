class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if(stones.length == 1) return stones[0];
        int n= stones.length;
        while(stones[n-2] >0) {
            int d = stones[n-1] - stones[n-2];
            stones[n-2] = 0;
            stones[n-1] = d;
            Arrays.sort(stones);
        }
        return stones[n-1];
    }
}