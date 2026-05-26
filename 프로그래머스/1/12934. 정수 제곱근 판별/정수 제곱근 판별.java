class Solution {
    public long solution(long n) {
        if (Math.sqrt(n) != (long) Math.sqrt(n)) {
            return -1;
        } else {
            return (long) ((int) Math.sqrt(n) + 1) * ((int) Math.sqrt(n) + 1);
        }
    }
}