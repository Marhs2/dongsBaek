class Solution {
    public int solution(int a, int b) {
        if (Integer.parseInt(Integer.toString(a) + Integer.toString(b)) > 2 * b * a){
            return Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        } else{
            return 2 * b * a;
        }
    }
}