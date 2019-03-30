/*
168p, 14번

다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
int[] score = {95, 88, 76, 62, 55};

그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라.
"그만"을 입력받으면 종료한다.

입출력 예시
과목 이름 >> Jaba
없는 과목입니다.
과목 이름 >> Java
Java의 점수는 95
과목 이름 >> 안드로이드
안드로이드의 점수는 55
과목 이름 >> 그만
*/
package universityhomework;
import java.util.Scanner;

public class Page168No14 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        // euc-kr로 입력받는 값을 인코딩하는 이유는 기본적으로 UTF-8로 한글을 입력받으면 깨지기때문이다.
        Scanner scan = new Scanner(System.in, "euc-kr");

        while (true) {
            System.out.print("과목 이름 >> ");
            String inputSubject = scan.nextLine(); // 과목명을 입력받아 inputSubject에 저장.
            if (inputSubject.equals("그만")) break; // inputSubject가 "그만"이면 반복문을 멈춘다.

            int checkSubject = -1; // 입력받은 과목명이 존재하기위해 초기값을 -1로 설정.

            for(int i = 0; i < course.length; i++) {
                if (course[i].equals(inputSubject)) { // 과목명이 존재하는 경우
                    checkSubject = i; // 해당 인덱스 번호를 checkSubject에 저장한다.
                    break;
                }
            }

            if (checkSubject == -1) { // -1인 경우 입력받은 과목명은 없다.
                System.out.println("없는 과목입니다.");
            } else { // 그 외의 인경우 입력받은 과목명이 있다.
                System.out.println(course[checkSubject] + "의 점수는 " + score[checkSubject]);
            }
        }

        scan.close();
    }
}