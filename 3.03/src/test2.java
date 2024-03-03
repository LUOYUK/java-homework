import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        int x = sc.nextInt();
        int m = x % 3;
        int n = x / 3;

        if(x==1||x==2){
            System.out.print("输出" + 1);
        }else if (m == 0 && x > 0) {
            int a = (int) Math.pow(2, n);
            System.out.println("输出" + a);
        } else {
            int b = (int) Math.pow(2, n);
            System.out.println("输出" + (b + 1));
        }

    }
}










