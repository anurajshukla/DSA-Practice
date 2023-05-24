class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0; 
        Set <Integer> s = new HashSet<>();
        for(int i : jewels.toCharArray()) {
            s.add(i);
        }
        for(int i : stones.toCharArray()) {
            if(s.contains(i)) {
                count++;
            }
        }
        return count;
    }
}