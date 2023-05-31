class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        for(int i=0; i<n/2; i++) {
            a[i] = i+1;
            a[i + n/2] = -(i+1);
        }
        return a;
    }
}