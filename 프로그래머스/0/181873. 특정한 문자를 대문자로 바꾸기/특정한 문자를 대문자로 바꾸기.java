class Solution {
    public String solution(String my_string, String alp) {
        for (char a : my_string.toCharArray()) {
            if (a == alp.charAt(0)) {
                my_string = my_string.replace(a, Character.toUpperCase(a));
            }
        }
        return my_string;
    }
}