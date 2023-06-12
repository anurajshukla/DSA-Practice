class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ot = new ArrayList<>();
        subset(nums, 0, ot, list);
        return list;
    }
    public void subset(int nums[], int i, ArrayList<Integer> ot, List<List<Integer>> list){
        if(i == nums.length){ list.add(new ArrayList<>(ot)); return; }
        ot.add(nums[i]);
        subset(nums, i + 1, ot, list);
        ot.remove(ot.size()-1);
        subset(nums, i + 1, ot, list);
    }
}