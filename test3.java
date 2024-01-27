import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int n = num % 10;
            num /= 10;
            reversedNum = reversedNum * 10 + n;
        }

        boolean flag = (originalNum == reversedNum);

        if (flag) {
            System.out.println(originalNum + " 是的");
        } else {
            System.out.println(originalNum + " 不是");
        }
    }
}