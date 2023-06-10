class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String[] americano = {"iceamericano", "americanoice","hotamericano", "americanohot", "americano", "anything"};
        String[] latte = {"icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"};
        for(int i=0; i<order.length; i++) {
            for(int j=0; j<americano.length; j++) {
                if(order[i].equals(americano[j])) {
                    answer += 4500;
                    break;
                } else if(order[i].equals(latte[j])) {
                    answer += 5000;
                    break;
                }
            }

        }
        return answer;
    }
}