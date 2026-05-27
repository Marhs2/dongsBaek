class Solution {
    boolean solution(String s) {
        int PSIze = Math.toIntExact(s.toUpperCase().chars().filter(c -> c == 'P').count());
        int YSIze = Math.toIntExact(s.toUpperCase().chars().filter(c -> c == 'Y').count());
        if (PSIze == YSIze){
            return true;
        }else{
            return false;
        }


    }
}