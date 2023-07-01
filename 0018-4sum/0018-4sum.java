class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> a=new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]); list.add(nums[j]);
                        list.add(nums[k]); list.add(nums[l]);
                        a.add(list);
                        k++; l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }
        return new ArrayList<>(a);  
    }
}