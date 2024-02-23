package test1;

import java.util.Scanner;

public class Test extends useCompute {
    public static void main(String[] args) {
        useCompute  jsq = new useCompute();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入进行计算的两个数:");
        int  n = sc.nextInt();
        int  m = sc.nextInt();

        System.out.println("1.加法运算");
        System.out.println("2.减法运算");
        System.out.println("3.乘法运算");
        System.out.println("4.除法运算");
        System.out.println("请输入你要选择的运算方式:");
        int s = sc.nextInt();


        switch (s) {
            case 1:
                Compute jia = new Addition();
                jsq.useCom(jia, n,m);
                break;
            case 2:
                Compute jian = new Subtraction();
                jsq.useCom(jian, n,m);
                break;
            case 3:
                Compute cheng = new Multiplication();
                jsq.useCom(cheng, n,m);
                break;
            case 4:
                Compute chu = new Division();
                jsq.useCom(chu, n,m);
                break;
        }

    }
}
