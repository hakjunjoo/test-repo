class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String answer = "";
        String[] sArr = s.split(" ");
        
        String[] sArr2 = new String[sArr.length];
        for(int i=0; i<sArr2.length; i++) {
            sArr2[i] = "";
        }
        
        for(int j=0; j<sArr.length; j++) {
            
            if(sArr[j].equals("")) continue;
            
            for(int i=0; i<sArr[j].length(); i++) {
                if(i % 2 == 0) {
                    sArr2[j] += Character.toUpperCase(sArr[j].charAt(i));
                } else {
                    sArr2[j] += sArr[j].charAt(i);
                }
            }
        }
        
        answer = String.join(" ", sArr2);
        
        if(s.length() == answer.length()) {
            return answer;
        } else {
            int length =  s.length() - answer.length();
            // 마지막 공백이 있는 경우
            for(int i=0; i<length; i++) {
                answer += " ";
            }
            return answer;
        }
        
        
    }
}