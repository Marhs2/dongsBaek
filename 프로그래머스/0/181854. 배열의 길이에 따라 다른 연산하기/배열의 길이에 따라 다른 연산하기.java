import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int n) {

        List<Integer> list = new ArrayList<Integer>();

        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    list.add(arr[i] + n);
                } else {
                    list.add(arr[i]);
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    list.add(arr[i] + n);
                } else {
                    list.add(arr[i]);
                }
            }
        }


        return list;
    }
}