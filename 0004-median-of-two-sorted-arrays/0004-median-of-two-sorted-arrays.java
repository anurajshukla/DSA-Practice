class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            al.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            al.add(nums2[i]);
        }
        Integer[] r = new Integer[al.size()];
        r = al.toArray(r);
        Arrays.sort(r);
        double m=0;
        int n = r.length;
        if(r.length%2 == 0) {
            m = (r[(n/2-1)] + r[(n/2)])/2.0;
        }
        else{
            m = r[n/2];
        }
        return m;
    }
}