import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("请输入杨辉三角的层数：");
        showTriangle(n);
    }

    public static void showTriangle(int n) {

        int[][] arr = new int[n][2 * n + 1];
        arr[0][n] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
