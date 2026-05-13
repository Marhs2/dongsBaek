import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<String>(List.of(strArr));
        
        for (String a : strArr) if (a.contains("ad")) answer.remove(a);

        return answer;
    }
}