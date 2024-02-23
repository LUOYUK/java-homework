package test2;

import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {
        Grade();

    }

    public static void Grade() {
        Scanner sc = new Scanner(System.in);

        int grade;

        while (true) {
            System.out.println("请输入得到成绩:");
            grade = sc.nextInt();
            if (grade <= 100 && grade >= 0) {
                System.out.println(grade);
                break;
            } else {
                System.out.println("输入的成绩异常 请重新输入：");
            }
        }
    }
}







