class Solution {
    /*public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set <Integer> set1 = new HashSet<>();
        for(int i : nums2) {
            set1.add(i);
        }
        Set<Integer> Set2 = new HashSet<> ();
        for(Integer var : nums1) {
            if (set1.contains(var)) {
                Set2.add(var);
            }
        }
        int[] arr = new int[Set2.size()];
        int d =0;
        for(Integer value : Set2) {
            arr[d] = value;
            d++;
        }
        return arr;
    }
    */
    
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        Set<Integer> finalSet = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                finalSet.add(var);
            }
        }
        int[] arr = new int[finalSet.size()];
        int idx = 0;
        for (Integer value : finalSet) {
            arr[idx] = value;
            idx++;
        }
        return arr;
    }
    
}