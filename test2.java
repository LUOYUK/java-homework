import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个正整数:");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        reverseSUM(s);
    }

    public static void reverseSUM(String s) {
        char[] chars = s.toCharArray();
        int count = chars.length;

        // 使用数组来存储逆序后的数字
        char[] reverseChars = new char[count];
        for (int i = 0; i < count; i++) {
            reverseChars[i] = chars[count - i - 1];
        }

        String reverseS = String.valueOf(reverseChars);
        int reversedNum = Integer.parseInt(reverseS);

        System.out.println("您输入的正整数的位数是" + count);
        System.out.println("您输入的正整数的逆序是" + reversedNum);
    }
}