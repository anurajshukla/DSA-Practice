class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int t = 0;
        int[] a = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(i!= j) {if(nums[i] > nums[j]) { t++; } }
            }
            a[i] = t; 
            t=0;
        }
        return a;
    }
}