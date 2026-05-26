
public class Solution {
    public int solution(int n) {
        int sum = 0;
        for (char ch : Integer.toString(n).toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }
}