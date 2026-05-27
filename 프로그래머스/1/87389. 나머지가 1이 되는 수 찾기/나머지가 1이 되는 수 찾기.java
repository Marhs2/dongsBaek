class Solution {
    public int solution(int n) {
        int num = 1;
        while (true) {
            if (n % num == 1) {
                return num;
            }
            num++;
        }
    }
}