import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] newArr = Arrays.copyOf(num_list, num_list.length + 1);
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            newArr[newArr.length - 1] = (num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            newArr[newArr.length - 1] = num_list[num_list.length - 1] * 2;
        }
        return newArr;
    }
}