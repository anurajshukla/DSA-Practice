class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> s1 = new HashSet<>();
        int c=0;
        for(int i : nums) {
            s1.add(i);
        }
         for(int i : nums ) {
             if(s1.contains(i-diff) && s1.contains(i - (diff*2))) { c++;}
         }
        return c;
    }
}