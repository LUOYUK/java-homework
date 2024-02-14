package test3;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        while (true) {
            Calculator calculator = new Calculator();

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入a的值:" + "  ");
            double a = sc.nextDouble();

            System.out.println("请输入b的值:" + "  ");
            double b = sc.nextDouble();

            calculator.setA(a);
            calculator.setB(b);

            calculator.getA();
            calculator.getB();

            System.out.println("----请输入选择的计算方式----");
            System.out.println("1.加法运算：");
            System.out.println("2.减法运算：");
            System.out.println("3.乘法运算：");
            System.out.println("4.除法运算：");

            int n = sc.nextInt();
            switch (n) {
                case (1):
                    calculator.add();
                    System.out.println("----------");
                    break;
                case (2):
                    calculator.subtract();
                    System.out.println("----------");
                    break;
                case (3):
                    calculator.multiply();
                    System.out.println("----------");
                    break;
                case (4):
                    calculator.divide();
                    System.out.println("----------");
                    break;

            }
        }

    }

}
