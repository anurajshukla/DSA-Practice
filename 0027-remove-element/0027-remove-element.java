class Solution {
    public int removeElement(int[] nums, int val) {
        int flag=0, index=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[index++]=nums[i];
                flag=1;
            }
            if(nums[i]==val)
                flag=1;
        }
        
        if(flag==1)
        return index;
        
        else {
            return nums.length;
        }
    }
}