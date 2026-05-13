class Solution {
    public int solution(String myString, String pat) {
        String text = myString.replace("A", "#").replace("B", "A").replace("#", "B");
        return text.contains(pat) ? 1 : 0;
    }
}