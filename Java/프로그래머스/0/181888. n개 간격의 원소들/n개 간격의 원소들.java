import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) list.add(num_list[i]);
        }

        return list;
    }
}