class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0; // 나머지 쿠폰
        int coupon2 = 0; // 나머지 쿠폰
        
        while(chicken > 0) {
            answer += chicken/10;
            coupon += chicken%10;
            chicken /= 10;
        }
        
        // System.out.println(coupon);
        
        if(coupon >=10) {
            while(coupon > 0) {
                answer += coupon/10;
                coupon2 += coupon%10;
                coupon /= 10;
            }
        }
        
        if(coupon2 >= 10) {
            while(coupon2 > 0) {
                answer += coupon2/10;
                coupon2 /= 10;
            }
        }
        
        return answer;
    }
}