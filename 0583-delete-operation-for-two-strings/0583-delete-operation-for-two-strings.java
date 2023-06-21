class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] i : dp) { Arrays.fill(i, -1); }
        int count = Count(word1, word2, m, n, dp);
        return m + n - 2*count;
    }
    public int Count(String word1, String word2, int m, int n, int[][] dp) {
        if(n==0 || m==0) { return 0; }
        if(dp[m][n] != -1) {  return dp[m][n];  }
        if(word1.charAt(m-1) == word2.charAt(n-1)) {
            return dp[m][n] = 1 + Count(word1, word2, m-1, n-1, dp);
        }
        else {
            return dp[m][n] = Math.max(Count(word1, word2, m-1, n, dp), Count(word1, word2, m, n-1, dp));
        }
     }
}