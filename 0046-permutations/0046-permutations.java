class Solution {
     List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        list.clear();
        permutation(nums, 0);
        return list;  
    }
    public void Swap(int a, int b, int [] nums) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
    public void permutation(int[] nums, int index) {
        if(nums.length == index) {
            List<Integer> l = new ArrayList<>();
            for(int num : nums) {
                l.add(num);
            }
            list.add(l);
        }
        else{
            for(int i=index; i<nums.length; i++) {
                Swap(index, i, nums);
                permutation(nums, index+1);
                Swap(index, i, nums);
            }
        }
    }
}