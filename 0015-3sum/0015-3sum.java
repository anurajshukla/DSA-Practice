class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> a=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            int n1 = i+1;
            int n2 = nums.length-1;
            while(n1<n2) {
                int sum = nums[i] + nums[n1] + nums[n2];
                if(sum ==0) {
                    List<Integer> b = new ArrayList<>();
                    b.add(nums[i]); b.add(nums[n1]); b.add(nums[n2]);
                    a.add(b);
                    n1++;
                }
                else if(sum <0) { n1++; }
                else { n2--; }
            }
        }
        return new ArrayList<>(a);
    }
}