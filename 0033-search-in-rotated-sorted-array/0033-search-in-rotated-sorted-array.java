class Solution {
    public int search(int[] nums, int target) {
        int s=0, e=nums.length-1, mid=0;
        while(s<=e) {
            mid = s + (e-s)/2;
            if(nums[mid] == target) { return mid; }
            if(nums[mid] >= nums[s]) {
                if(target > nums[mid] || nums[s] > target) { s = mid+1; }
                else { e = mid-1; }
            }
            else {
                if(nums[mid] > target || target > nums[e]) { e = mid-1; }
                else { s = mid+1; }
            }
        }
        return -1;
    }
}