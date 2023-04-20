class Solution {
        public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] ans = new int[2];
        ans[0] = StartIndex(nums,start,end,target);
        ans[1] = EndIndex(nums,start,end,target);
        return ans;
    }
    public static int StartIndex(int[] nums, int start, int end, int target){
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){ ans = mid; end = mid-1; }
            else if(nums[mid]>target){ end = mid-1; }
            else { start = mid+1; }
        }
        return ans;
    }
    public static int EndIndex(int[] nums, int start, int end, int target){
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){ ans = mid; start = mid+1; }
            else if(nums[mid]>target){ end = mid-1; }
            else{ start = mid+1; }
        }
        return ans;
    }
}