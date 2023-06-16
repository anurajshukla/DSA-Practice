class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        for(int i=0; i<nums.length; i+=2) {
            for(int j=i+2; j<nums.length; j+=2) {
                int temp=0;
                if(nums[i] > nums[j]) { temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;}
            }
        }
        
        for(int i=1; i<nums.length; i+=2) {
            for(int j=i+2; j<nums.length; j+=2) {
                int temp=0;
                if(nums[i] < nums[j]) { temp = nums[i]; nums[i] = nums[j] ; nums[j] = temp; }
            }
        }
        return nums;
    }
}