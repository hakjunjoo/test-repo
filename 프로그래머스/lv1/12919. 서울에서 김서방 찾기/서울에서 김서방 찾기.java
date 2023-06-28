class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String place = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                place = i+"";
                break;
            }
        }
        
        answer = "김서방은 " + place + "에 있다";
        return answer;
    }
}