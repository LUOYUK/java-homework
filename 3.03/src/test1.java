import java.util.Scanner;
import static java.lang.Math.pow;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        int x = sc.nextInt();
        int a =(int) Math.pow(2,32);
        if(-a<x && a>x){
            String y = Integer.toString(x);
         StringBuilder z = new StringBuilder(y);
            z.reverse();
            System.out.println("输出"+z);
        }else{
            System.out.println("输出"+0);
        }
    }
}
