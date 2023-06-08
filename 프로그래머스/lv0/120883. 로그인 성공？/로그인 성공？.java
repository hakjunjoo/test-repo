class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(String[] dbCompare : db) {
            if(id_pw[0].equals(dbCompare[0])) {
                if(id_pw[1].equals(dbCompare[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
        }
        return answer;
    }
}