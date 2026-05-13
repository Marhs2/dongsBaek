class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length == arr2.length) {
            int sum1 = 0;
            for (int a : arr1) sum1 += a;
            int sum2 = 0;
            for (int a : arr2) sum2 += a;

            if (sum1 == sum2) {
                return 0;
            } else if (sum1 < sum2) {
                return -1;
            } else {
                return 1;
            }


        } else {
            return 1;
        }
    }
}