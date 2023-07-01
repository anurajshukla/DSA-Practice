class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        //boundary cases
        if(nums.length == 1) { return nums[0]; }
        if(nums[0] != nums[1]) { return nums[0]; }
        if(nums[n-2] != nums[n-1]) { return nums[n-1]; }
        
        int s=1, e=n-1, mid=0;
        while(s <= e) {
            mid = s + (e-s)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) { 
                return nums[mid]; 
            }
            if(mid%2 == 0) {
                if(nums[mid] == nums[mid+1]) { s = mid +2; }
                else { e = mid; }
            }
            else {
                if(nums[mid] == nums[mid-1]) { s = mid +1; }
                else { e = mid; }
            }
        }
        return -1;
    }
}