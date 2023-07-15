class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1]+1;
            String str = new StringBuilder(my_string.substring(s, e)).reverse().toString();
            my_string = my_string.substring(0, s) + str + my_string.substring(e);
        }
        return my_string;
    }
}