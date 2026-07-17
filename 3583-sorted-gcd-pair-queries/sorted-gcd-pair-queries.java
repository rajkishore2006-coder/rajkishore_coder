class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int mx = 0;
        for (int x : nums)
            mx = Math.max(mx, x);

        int[] cnt = new int[mx + 1];
        for (int x : nums)
            cnt[x]++;

        long[] cntG = new long[mx + 1];

        for (int g = mx; g >= 1; g--) {

            long v = 0;

            for (int j = g; j <= mx; j += g) {
                v += cnt[j];
                cntG[g] -= cntG[j];
            }

            cntG[g] += v * (v - 1) / 2;
        }

        for (int i = 1; i <= mx; i++)
            cntG[i] += cntG[i - 1];

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = 1, r = mx;

            while (l < r) {
                int mid = (l + r) / 2;

                if (cntG[mid] > queries[i])
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}

        
    
