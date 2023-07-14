import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= yellow; i++) {
            if(yellow % i == 0) divisorList.add(i);
        }

        List<WidthAndHeight> list = new ArrayList<>();
        for (int i = 0; i < divisorList.size(); i++) {
            for (int j = i; j < divisorList.size(); j++) {
                if (divisorList.get(i) * divisorList.get(j) == yellow && divisorList.get(j)>=divisorList.get(i)) {
                    list.add(new WidthAndHeight(divisorList.get(j), divisorList.get(i)));
                    break;
                }
            }
        }

        for (WidthAndHeight widthAndHeight : list) {
            int width = widthAndHeight.getWidth();
            int height = widthAndHeight.getHeight();
            int brownCount = ((width + 2) * 2 ) + (height * 2);

            if (brownCount == brown) {
                answer[0] = width + 2; // 카펫의 가로 길이
                answer[1] = height + 2; // 카펫의 세로 길이
                break;
            }
        }
        
        return answer;
    }
}

class WidthAndHeight {
    private int width; // yellow의 가로
    private int height; // yellow의 세로

    public WidthAndHeight(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}