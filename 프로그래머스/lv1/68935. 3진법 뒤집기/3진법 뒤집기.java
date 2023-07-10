
class Solution {
    public int solution(int n) {
        String nStr = Integer.toString(n, 3);
        String nString = new StringBuilder(nStr).reverse().toString();
        int answer = Integer.parseInt(nString, 3);
        return answer;
    }
}