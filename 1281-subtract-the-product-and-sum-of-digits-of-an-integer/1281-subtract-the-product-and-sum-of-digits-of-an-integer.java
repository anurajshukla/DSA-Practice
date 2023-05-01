class Solution {
    public int subtractProductAndSum(int n) {
        int p=1, sum=0,i=0,r=0, diff=0;
        String s = Integer.toString(n);
        int[] a = new int[s.length()];
        while(n!=0) {
            r = n%10;
            a[i] = r;
            n/=10;
            i++;
        }
        for(int j=0; j<s.length(); j++) {
            p = p*a[j]; 
            sum = sum+a[j];
        }
        diff = p -sum; 
        return diff;
    }
}