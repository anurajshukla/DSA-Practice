class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while( i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) { i++; }
            else if(nums1[i] > nums2[j]) { j++; }
            else{ a.add(nums1[i]); i++;j++; }
        }
        int[] r = new int[a.size()];
        for(int k=0;k < a.size();k++){
            r[k] = a.get(k);
        }
        return r;
    }
}