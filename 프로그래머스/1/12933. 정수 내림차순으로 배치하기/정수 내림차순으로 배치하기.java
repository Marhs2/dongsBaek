import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();
        for (char ch : Long.toString(n).toCharArray()) {
            list.add((long) Integer.parseInt(String.valueOf(ch)));
        }

        list.sort(Collections.reverseOrder());

        return Long.parseLong(list.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}