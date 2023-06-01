class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            al.add(index[i], nums[i]);
        }
        int[] target = new int[al.size()];
        for(int i=0; i<al.size(); i++) {
            target[i] = al.get(i);
        }
        return target;
    }
}