class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) { return nums[0]; }
        if(nums[0]!=nums[1]) { return nums[0]; }
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        int s=0, e = nums.length-1, mid=0;
        while(s<= e) {
            mid = s + (e-s)/2;
            if(nums[mid] != nums[mid -1] && nums[mid] !=  nums[mid +1]) { return nums[mid]; }
            if(mid % 2 == 0){ 
                if(nums[mid] == nums[mid + 1]) { s = mid +2; }
                else { e = mid; }
            }
            else {
                if(nums[mid] == nums[mid -1]) { s = mid + 1; }
                else { e = mid; } 
            }
            
        }
        return -1;
    }
}