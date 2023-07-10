class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for(int i=1; i<=count; i++) {
            int newPrice = price * i;
            sum += newPrice;
        }
                        
        long answer = sum <= money ? 0 : (sum - money);

        return answer;
    }
}