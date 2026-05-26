class Solution {
    public boolean solution(int x) {
        String toStr = Integer.toString(x);
        int sum = 0;
        for (char ch : toStr.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }

        if(x % sum == 0){
            return true;
        }else{
            return false;
        }

    }
}