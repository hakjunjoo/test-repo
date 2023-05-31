import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=2; i<=n; i++) {
            while(n%i == 0) {
                list.add(i);
                n = n/i;
            }
        }
        
        TreeSet<Integer> list2 = new TreeSet<Integer>(list);
        ArrayList<Integer> list3 = new ArrayList<Integer>(list2); //list의 중복 제거 과정
        
        int[] answer = new int[list3.size()];
        for(int i=0; i<list3.size(); i++) {
            answer[i] = list3.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}