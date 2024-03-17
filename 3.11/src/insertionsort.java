// 插入排序
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序的数字，用逗号隔开：");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        insertionSort(nums);
        System.out.print("插入排序结果为：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}