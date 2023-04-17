class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        for(int i=0; i< m; i++) {
            nums[i] = nums1[i];
        }
        for(int j = m; j< m+n; j++) {
            nums[j] = nums2[j - m];
        }
        Arrays.sort(nums);
        for(int i = 0; i<nums1.length; i++) {
        nums1[i] = nums[i];
        }
    }
}