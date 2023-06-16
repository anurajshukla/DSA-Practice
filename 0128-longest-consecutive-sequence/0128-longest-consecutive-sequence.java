class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) { set.add(n); }
        int count=0;
        for(int n:nums){
            if(!set.contains(n-1)){
                int i = 0;
                while(set.contains(n+i)){
                    i+=1;
                }
                count = Math.max(count, i);
            }
        }
        return count;
    }
}