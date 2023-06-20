import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        long[] defaultArr = {1001, 1001};

        List<Coordinate> list = new ArrayList<>();

        for(int i=0; i<line.length-1; i++) {
            for(int j=i; j<line.length; j++) {
                if(!Arrays.equals(operate(line[i], line[j]), defaultArr)) {
                    long[] intArr = operate(line[i], line[j]);
                    list.add(new Coordinate(intArr[0], intArr[1]));
                }
            }
        }

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i).getX()+ " " + list.get(i).getY());
//        }

        //최댓값 구하기
        long xMax = list.get(0).getX(), yMax = list.get(0).getY();

        for(int i=0; i<list.size(); i++) {
            if(xMax<list.get(i).getX()) {
                xMax = list.get(i).getX();
            }
            if(yMax<list.get(i).getY()) {
                yMax = list.get(i).getY();
            }
        }

        //최솟값 구하기
        long xMin = list.get(0).getX(), yMin = list.get(0).getY();

        for(int i=0; i<list.size(); i++) {
            if(xMin > list.get(i).getX()) {
                xMin = list.get(i).getX();
            }
            if(yMin > list.get(i).getY()) {
                yMin = list.get(i).getY();
            }
        }
//        System.out.println(xMax + " " + yMax);

        //맞는 배열의 크기를 구하고
        String[][] answer = new String[(int)(yMax-yMin)+1][(int)(xMax-xMin)+1];
        for (String[] strings : answer) {
            Arrays.fill(strings, ".");
        }

        // 교점이 있는 부분만 *로 바꾼다.
        long a = yMin<0 ? -yMin : -yMin;
        long b = xMin<0 ? -xMin : -xMin;

        for (Coordinate coordinate : list) {
            answer[(int)(coordinate.getY() + a)][(int)(coordinate.getX() + b)] = "*";
        }
//        System.out.println(Arrays.deepToString(answer));

        String[] answerArr = new String[answer.length];
        for (int i = 0; i < answerArr.length; i++) {
            answerArr[i] = String.join("",answer[i]);
        }

        String[] realAnswer = new String[answerArr.length];
        for(int i = 0; i < realAnswer.length; i++) {
            realAnswer[i] = answerArr[answerArr.length-1-i];
        }
        
        // System.out.println(Arrays.toString(realAnswer));
        return realAnswer;


    }

    // 교점을 계산하는 메소드
    private static long[] operate(int[] arr, int[] arr2) {
        long[] result = {1001, 1001};

        long a = (long)arr[1]*(long)arr2[2] - (long)arr[2]*(long)arr2[1]; //BF-ED
        long b = (long)arr[2]*(long)arr2[0] - (long)arr[0]*(long)arr2[2]; //EC-AF
        long c = (long)arr[0]*(long)arr2[1] - (long)arr[1]*(long)arr2[0]; //AD-BC

        if( c != 0 && a % c == 0 && b % c == 0 ) {
            result[0] = (a / c);
            result[1] = (b / c);
            return result;
        }

        return result;
    }
}

// 좌표를 담는 객체를 위한 클래스
class Coordinate {
    private long x;
    private long y;

    public Coordinate(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}