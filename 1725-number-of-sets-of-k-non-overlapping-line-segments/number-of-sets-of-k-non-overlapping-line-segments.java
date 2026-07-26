class Solution {
    private static final int MOD = 1000000007;

    public int numberOfSets(int n, int k) {

        long[][] dp = new long[k + 1][n];
        long[][] prefix = new long[k + 1][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
            prefix[0][i] = i == 0 ? 1 : (prefix[0][i - 1] + 1) % MOD;
        }

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i < n; i++) {
                dp[j][i] = (dp[j][i - 1] + prefix[j - 1][i - 1]) % MOD;
                prefix[j][i] = (prefix[j][i - 1] + dp[j][i]) % MOD;
            }
        }

        return (int) dp[k][n - 1];
    }
}
 
        
    
