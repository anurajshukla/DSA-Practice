class Solution {
    public void sortColors(int[] nums) {
        int [] a = new int[3];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) { a[0]++; }
            else if(nums[i] == 1) { a[1]++; }
            else { a[2]++; }
        }
        for(int i=0; i<a[0]; i++) {
            nums[i] = 0;
        }
        for(int i=a[0]; i<a[0]+a[1]; i++) {
            nums[i] =1;
        }
        for(int i=a[0]+a[1]; i<nums.length; i++) {
            nums[i] = 2;
        } 
    }
}