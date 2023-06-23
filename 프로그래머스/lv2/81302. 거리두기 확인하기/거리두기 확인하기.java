import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
                int[] result = new int[5];
        int cnt = 0;
        //2차원 배열로 만들기

        Loop:
        for (int k=0; k < places.length; k++) {
            String[][] waitingRoom = new String[5][5];
            for (int i = 0; i < 5; i++) {
                waitingRoom[i] = places[k][i].split("");
            }
//            System.out.println(Arrays.deepToString(waitingRoom));

            List<Coordinate> coordinateList = new ArrayList<>();
            List<Coordinate> coordinateList2 = new ArrayList<>(); //맨허튼 거리가 2인 좌표들만 있는 리스트

            // 각 좌표 값이 P인지 확인 P이면 List에 추가
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (waitingRoom[i][j].equals("P")) {
                        coordinateList.add(new Coordinate(j, i));
                    }
                }
            }

            if (coordinateList.size() == 0) {
                result[cnt] = 1;
                cnt++;
                continue Loop;
            }

            // for (int i = 0; i < coordinateList.size(); i++) {
            //     System.out.println(coordinateList.get(i).getX() + " " + coordinateList.get(i).getY());
            // }
            // System.out.println("--------");

            // 맨허튼 거리 계산
            for (int i = 0; i < coordinateList.size(); i++) {
                for (int j = i + 1; j < coordinateList.size(); j++) {
                    if (Math.abs(coordinateList.get(i).getX() - coordinateList.get(j).getX()) + Math.abs(coordinateList.get(i).getY() - coordinateList.get(j).getY()) == 2) {
                        coordinateList2.add(coordinateList.get(i));
                        coordinateList2.add(coordinateList.get(j));
                    } else if (Math.abs(coordinateList.get(i).getX() - coordinateList.get(j).getX()) + Math.abs(coordinateList.get(i).getY() - coordinateList.get(j).getY()) == 1) {
                        cnt++;
                        continue Loop;
                    }
                }
            }

            // for (int i = 0; i < coordinateList2.size(); i++) {
            //     System.out.println(coordinateList2.get(i).getX() + " " + coordinateList2.get(i).getY());
            // }
            // System.out.println("--------");

            if (coordinateList2.size() == 0) {
                result[cnt] = 1;
                cnt++;
                continue Loop;
            } else {
                for (int i = 0; i < coordinateList2.size() - 1; i += 2) {
                    if (coordinateList2.get(i).getX() == coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() != coordinateList2.get(i + 1).getY()) {
                        int yCoordinate = Math.min(coordinateList2.get(i).getY(), coordinateList2.get(i + 1).getY());
                        if (waitingRoom[yCoordinate + 1][coordinateList2.get(i).getX()].equals("O")) {
                            cnt++;
                            continue Loop;
                        }
                    } else if (coordinateList2.get(i).getY() == coordinateList2.get(i + 1).getY() && coordinateList2.get(i).getX() != coordinateList2.get(i + 1).getX()) {
                        int xCoordinate = Math.min(coordinateList2.get(i).getX(), coordinateList2.get(i + 1).getX());
                        if (waitingRoom[coordinateList2.get(i).getY()][xCoordinate + 1].equals("O")) {
                            cnt++;
                            continue Loop;
                        }
                    } else if (coordinateList2.get(i).getX() != coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() != coordinateList2.get(i + 1).getY()) {
                        if ((coordinateList2.get(i).getX() < coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() < coordinateList2.get(i + 1).getY())
                                || (coordinateList2.get(i).getX() > coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() > coordinateList2.get(i + 1).getY())) {
                            int xCoordinate = Math.min(coordinateList2.get(i).getX(), coordinateList2.get(i + 1).getX());
                            int yCoordinate = Math.min(coordinateList2.get(i).getY(), coordinateList2.get(i + 1).getY());
                            if (waitingRoom[yCoordinate][xCoordinate + 1].equals("O") || waitingRoom[yCoordinate + 1][xCoordinate].equals("O")) {
                                cnt++;
                                continue Loop;
                            }
                        } else if ((coordinateList2.get(i).getX() < coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() > coordinateList2.get(i + 1).getY())
                                || (coordinateList2.get(i).getX() > coordinateList2.get(i + 1).getX() && coordinateList2.get(i).getY() < coordinateList2.get(i + 1).getY())) {
                            int xCoordinate = Math.min(coordinateList2.get(i).getX(), coordinateList2.get(i + 1).getX());
                            int yCoordinate = Math.max(coordinateList2.get(i).getY(), coordinateList2.get(i + 1).getY());
                            if (waitingRoom[yCoordinate][xCoordinate + 1].equals("O") || waitingRoom[yCoordinate - 1][xCoordinate].equals("O")) {
                                cnt++;
                                continue Loop;
                            }
                        }
                    }
                }
            }
            result[cnt] = 1;
            cnt++;
            continue Loop;
        }
        return result;
    }
}

// 좌표 저장 클래스
class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}