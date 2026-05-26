class Solution {
    public long[] solution(int x, int n) {
        long start = x;
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = start;
            start += x;

        }
        return arr;
    }
}