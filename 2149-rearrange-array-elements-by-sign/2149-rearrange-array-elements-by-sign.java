class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(nums[i] >= 0) { list1.add(nums[i]); }
            else { list2.add(nums[i]); }
        }
        for(int i=0; i<n/2; i++) {
            nums[2*i] = list1.get(i);
            nums[2*i +1] = list2.get(i);
        }
        return nums;
    }
}