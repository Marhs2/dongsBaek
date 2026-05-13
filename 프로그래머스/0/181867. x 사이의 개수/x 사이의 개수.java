import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> List = new ArrayList();
        for (String i : myString.split("x", -1)) {
            List.add(i.length());
        }

        return List;
    }
}