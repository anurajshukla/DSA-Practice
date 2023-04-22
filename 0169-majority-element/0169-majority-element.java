class Solution {
    public int majorityElement(int[] nums) {
        int c=0, e=0;
        for(int i=0; i<nums.length; i++) {
            if(c==0) {c=1; e=nums[i];}
            else if(e== nums[i]) { c++;}
            else { c--;}
        }
        int c1 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == e) { c1++;}
        }
        if(c1 > (nums.length/2)) { return e;}
        return -1;
    }
}