import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(long n) {
        List<Integer> list = new ArrayList<>();
        for (char ch : Long.toString(n).toCharArray()) {
            list.add(Integer.parseInt(String.valueOf(ch)));
        }

        Collections.reverse(list);

        return list;
    }
}