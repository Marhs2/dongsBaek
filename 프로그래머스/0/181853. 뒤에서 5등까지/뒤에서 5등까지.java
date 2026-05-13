import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        int[] answer = Arrays.copyOfRange(num_list, 0, 5);

        return answer;
    }
}