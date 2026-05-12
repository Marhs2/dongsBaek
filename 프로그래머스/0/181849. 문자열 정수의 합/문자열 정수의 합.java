class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for (char a : num_str.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(a));
        }
        return sum;
    }
}