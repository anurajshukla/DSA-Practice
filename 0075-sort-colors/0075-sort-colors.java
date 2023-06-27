class Solution {
    public void sortColors(int[] nums) {
        int s=0, e=nums.length-1, mid=0;
        while(mid<= e) {
            int temp=0;
            if(nums[mid] == 0) { 
                temp=nums[s]; nums[s] = nums[mid]; nums[mid] = temp; s++; mid++; 
            }
            else if(nums[mid] == 1) { mid++; }
            else {
                temp=nums[mid]; nums[mid] = nums[e]; nums[e] = temp; e--;
            }
        }
    }
    
}