class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            int before = s.length();
            s = deleteZero(s);
            int after = s.length();

            zeroCount += before - after;

            s = Integer.toString(s.length(), 2);
            count++;
        }
        
        int[] answer = {count, zeroCount};
        return answer;
    }
    
    private static String deleteZero(String s) {
        String[] sArr = s.split("");
        String str = "";
        for (String s1 : sArr) {
            if (s1.equals("1")) {
                str += s1;
            }
        }
        return str;
    }
    
}