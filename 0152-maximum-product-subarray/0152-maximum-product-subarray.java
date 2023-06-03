class Solution {
    public int maxProduct(int[] nums) {
        int p = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            p*=nums[i];
            if(p > max){ max = p; }
            if(p == 0){ p = 1; }
        }
        p = 1;
        for(int j=nums.length-1; j>=0; j--){
            p*=nums[j];
            if(p > max){ max = p;}
            if(p == 0){ p = 1; }
        }
        return max;
    }
}