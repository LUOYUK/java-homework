// 快速排序
import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序的数字，用逗号隔开：");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        quickSort(nums, 0, nums.length - 1);
        System.out.print("快速排序结果为：");
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);
            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}