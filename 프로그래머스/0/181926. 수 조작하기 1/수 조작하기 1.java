class Solution {
    public int solution(int n, String control) {

        int sum = n;

        for (char ch : control.toCharArray()) {
            if (ch == 'w') {
                sum += 1;
            } else if (ch == 's') {
                sum -= 1;
            } else if (ch == 'd') {
                sum += 10;
            } else {
                sum -= 10;
            }


        }

        return sum;

    }
}