package universityhomework;
import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        if(word.equals("그만")) return word; // 매개변수 word가 "그만"이면 word를 반환.
        
        int checkKorString = -1; // 이 변수로 매개변수가 있는지 확인함.
        for(int i = 0; i < kor.length; i++) {
            // 매개변수가 kor 배열에 있으면 그 인덱스를 checkKorString에 저장하고 반복멈춤.
            if(kor[i].equals(word)) { 
                checkKorString = i;
                break;
            }
        }

		if(checkKorString == -1) return "없음"; // -1이면 단어를 못찾았으므로 "없음"반환
        else return eng[checkKorString]; // 찾은 경우 kor과 eng의 인덱스는 같으므로 인덱스에 해당하는 eng문자반환.
    }
}

public class Page245No10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "euc-kr");

        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어? ");
            String inputWord = scan.nextLine(); // 입력받은 값을 inputWord에 저장한다.
            String result = Dictionary.kor2Eng(inputWord); // Dictionary함수를 사용하여 반환값을 result에 저장
            
            /*
            result가 "그만"이면 루프를 멈추고
            "없음"이면 입력받은 값이 없다고 출력하고
            그 외에는 영어를 찾아서 반환값을 출력.
            */
            if(result.equals("그만")) break;
            else if(result.equals("없음")) System.out.println(inputWord + "는 저의 사전에 없습니다.");
            else System.out.println(inputWord + "는 " + result);
        }
        scan.close();
    }
}