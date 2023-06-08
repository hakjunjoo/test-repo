class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        
        for(int i=0; i<beforeArr.length; i++) {
            for(int j=0; j<afterArr.length; j++) {
                if(beforeArr[i].equals(afterArr[j])) {
                    afterArr[j] = "1";
                    break;
                }
            }
        }
        
        for(int j=0; j<afterArr.length; j++) {
            if(!(afterArr[j].equals("1"))) {
                answer = 0;
            }
        }
        
        return answer;
    }
}