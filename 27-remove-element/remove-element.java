class Solution {
    public int removeElement(int[] a, int v) {
        int k = 0;
        for (int n : a)
            if (n != v) a[k++] = n;
        return k;
    }
}
