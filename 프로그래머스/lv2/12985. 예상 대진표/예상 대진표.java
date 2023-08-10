class Solution {
    public int solution(int n, int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        boolean even = true;
        
        int cnt = 0;
        while(a != b) {  
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
            cnt++;
        
        }
                
        System.out.println(cnt);

        return cnt;
    }
    
}