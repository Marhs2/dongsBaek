import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                list.add(a);
            }
        }

        return list;
    }
}