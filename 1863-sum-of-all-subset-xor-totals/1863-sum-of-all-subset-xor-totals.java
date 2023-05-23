class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        return sumXOR(nums,0,0);
    }
    
    int sumXOR(int[] arr,int i,int cur){
        if(i==arr.length){
            return cur;
        }
        return sumXOR(arr,i+1,cur^arr[i]) + sumXOR(arr,i+1,cur);
    }
}