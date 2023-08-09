import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);

        List<Integer> list = new ArrayList<>();
        for (int person : people) {
            list.add(person);
        }

        int cnt = 0;
        while (list.size() > 1) {
            int heavyPerson = list.get(list.size()-1);
            int lightPerson = list.get(0);

            if (heavyPerson + lightPerson > limit) {
                list.remove(list.size()-1);
            } else {
                list.remove(list.size()-1);
                list.remove(0);
            }

            cnt++;
        }

        if (list.size() == 1) {
            cnt++;
        }
        
        return cnt;
    }
}