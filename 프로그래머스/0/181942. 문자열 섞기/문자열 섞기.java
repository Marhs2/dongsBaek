import java.util.ArrayList;
import java.util.List;

class Solution {
    public StringBuilder solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(String.valueOf(str1.charAt(i)));
            sb.append(String.valueOf(str2.charAt(i)));


        }
        return sb;
    }
}