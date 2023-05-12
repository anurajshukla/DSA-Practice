class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] a = new int[encoded.length +1];
        a[0] = first;
        for(int i=1; i<a.length; i++){
            a[i] = (encoded[i-1] ^ a[i-1]);
        }
        return a;
    }
}