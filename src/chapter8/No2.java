package chapter8;

import java.io.*;

public class No2 {
    public static void main(String[] args) {
        try {
            String s;
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\temp\\phone.txt"), "MS949"));

            System.out.println("C:\\temp\\phone.txt를 출력합니다.");
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        }
    }
}