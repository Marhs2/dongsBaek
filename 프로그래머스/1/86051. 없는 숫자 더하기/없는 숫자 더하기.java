import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    public int solution(int[] numbers) {
        OptionalInt maxNum = Arrays.stream(numbers).max();
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            int finalI = i;
            if (Arrays.stream(numbers).filter(c -> c == finalI).count() <= 0) {
                sum += i;
            }

        }
        return sum;
    }
}