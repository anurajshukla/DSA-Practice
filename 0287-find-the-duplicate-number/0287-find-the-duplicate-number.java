class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c = nums[i]-1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);   
            }
            else{ i++; }
        }
        return nums[nums.length-1];
    }
    
    public void swap(int [] num, int i, int c){
        int t = num[i];
        num[i]=num[c];
        num[c]=t;
    }
}