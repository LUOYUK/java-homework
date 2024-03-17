// 堆排序
import java.util.Arrays;
import java.util.Scanner;

public class heapsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序的数字，用逗号隔开：");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        heapSort(nums);
        System.out.print("堆排序结果为：");
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] nums) {
        int len = nums.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(nums, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i, 0);
        }
    }

    public static void heapify(int[] nums, int len, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < len && nums[l] > nums[largest]) {
            largest = l;
        }
        if (r < len && nums[r] > nums[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            heapify(nums, len, largest);
        }
    }
}