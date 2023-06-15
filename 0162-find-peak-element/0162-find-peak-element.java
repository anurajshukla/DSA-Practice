class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) { return 0;}
        if(nums[0] > nums[1]) { return 0; }
        if(nums[nums.length -1] > nums[nums.length -2]) { return nums.length-1; }
        int s=1, e=nums.length-2, mid=0; 
        while(s <= e) {
            mid = s + (e-s)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {return mid; }
            else if(nums[mid] < nums[mid+1]) { s = mid+1; }
            else { e = mid -1; }
        }
        return 0;
    }
}