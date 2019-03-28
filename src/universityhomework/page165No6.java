/* 
165p 6번

배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수
를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리
동전, 10짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라.
이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.

int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류

예시:
금액을 입력하시오>>65123
50000원 짜리 : 1개
10000원 짜리 : 1개
1000원 짜리 : 5개
500원 짜리 : 0개
100원 짜리 : 1개
50원 짜리 : 0개
10원 짜리 : 2개
1원 짜리 : 3개
*/

package universityhomework;
import java.util.Scanner;

public class page165No6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 입력 받기 위해 Scanner 클래스를 생성합니다.
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
        
        System.out.print("금액을 입력하시오 >> ");
        int money = scan.nextInt(); // 금액의 수를 입력 받는다.
        scan.close(); // 입력 받을 변수는 이제 없으므로 scan함수를 정지 한다.(안 닫아도 오류는 안나지만 닫는걸 권장.)

        for(int i = 0; i < unit.length; i++) {
            int moneyRem = money / unit[i]; // int끼리의 나눗셈은 소수점이 없으므로 몫을 구하는 것과 같음.
            money %= unit[i]; // 몫은 이미 구했으므로 money에 해당 unit의 나머지를 저장
            System.out.printf("%d원 짜리 : %d개\n", unit[i], moneyRem); // 각각 unit의 케이스에 따른 몫의 결과를 출력
        }
    }
}