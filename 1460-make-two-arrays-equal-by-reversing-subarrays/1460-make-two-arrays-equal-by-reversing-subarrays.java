class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        List<Integer> al = new ArrayList<>();
        for(int i=0; i< target.length; i++) {
            al.add(target[i]);
        }
        for(int num : arr) {
            if(!al.contains(num)) { return false; }
            else { al.remove(Integer.valueOf(num)); }
        }
        
        return true;
    }
}