class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // 2진수 => 10진수
        String[] bin1Arr = bin1.split("");
        int bin110 = 0; //bin1 10진수
        for(int i=0; i<bin1Arr.length; i++) {
            if(bin1Arr[i].equals("1")) {
                bin110 += Math.pow(2, bin1Arr.length-(i+1));
            }
        }
        // System.out.println(bin110);
        
        String[] bin2Arr = bin2.split("");
        int bin210 = 0; //bin2 10진수
        for(int i=0; i<bin2Arr.length; i++) {
            if(bin2Arr[i].equals("1")) {
                bin210 += Math.pow(2, bin2Arr.length-(i+1));
            }
        }
        // System.out.println(bin210);
        
        int result = bin110+bin210;
        // 10진수 => 2진수
        if(result == 0) {
            return "0";
        } else {
            while (result > 0) {
                String remain = (result%2)+"";
                answer = remain + answer;
                result /= 2;
            }
        }   
        return answer;
    }
}