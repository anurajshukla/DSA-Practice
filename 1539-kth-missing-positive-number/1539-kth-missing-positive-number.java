class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        Set<Integer> set = new HashSet<>();
        for(int x : arr) set.add(x);
        for(int i = 1;i<=arr[arr.length-1];i++){
            if(set.contains(i)==false) j++;
            if(j == k) return i;
        }
        return (arr[arr.length-1]-j)+k;
        
    }
}