class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> neww = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++){
            neww.add(nums[i]);
        }
        int i = 0;
        for(int j:neww){
            nums[i++] = j;
        }
        return neww.size();
    }
}