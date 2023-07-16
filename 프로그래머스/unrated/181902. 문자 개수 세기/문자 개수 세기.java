class Solution {
    public int[] solution(String my_string) {
        int[] alphaUpperCase = new int[26];
        int[] alphaLowerCase = new int[26];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int idx = (int) c - 'A';
                alphaUpperCase[idx] ++;
            } else {
                int idx = (int) c - 'a';
                alphaLowerCase[idx]++;
            }
        }
        
        int[] alpha = new int[52];
        for (int i = 0; i < 26; i++) {
            alpha[i] = alphaUpperCase[i];
            alpha[i+26] = alphaLowerCase[i];
        }
        
        return alpha;
    }
}