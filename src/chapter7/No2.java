package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class No2 {
    public static double gradeToDouble(String grade) {
        if (grade.equals("A")) {
            return 4.0;
        } else if (grade.equals("B")) {
            return 3.0;
        } else if (grade.equals("C")) {
            return 2.0;
        } else if (grade.equals("D")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> grades = new ArrayList<>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for (int i = 0; i < 6; i++) {
            grades.add(scan.next());
        }
        scan.close();

        double result = 0.0;

        for (String grade : grades) {
            result += gradeToDouble(grade);
        }

        System.out.println(result / 6);
    }
}