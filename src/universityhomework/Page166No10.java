/*
165p 10번문제

4 X 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여
임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 
만들어진 2차원 배열을 화면에 출력하라.

출력 예제
5   0   8   6
0   7   9   5
2   4   0   8
0   0   0   8
*/
package universityhomework;
import java.lang.Math;

public class Page166No10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; // 4 x 4인 2차원 배열을 생성한다.
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = (int)(Math.random() * 10) + 1; // 1부터 10까지 난수를 해당 위치에 삽입한다.
            }
        }

        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.print(arr[x][y] + " "); // 각각의 배열 위치를 출력한다(띄어쓰기를 넣는 이유는 구분하기 위해.)
            }
            System.out.println(); // println으로 줄바꿈을 한다, print는 줄바꿈이 없음
        }
    }
}