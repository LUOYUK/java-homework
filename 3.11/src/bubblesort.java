// 冒泡排序
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序的数字，用逗号隔开：");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        bubbleSort(nums);
        System.out.print("冒泡排序结果为：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
