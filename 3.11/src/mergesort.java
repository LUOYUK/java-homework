// 合并排序
import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待排序的数字，用逗号隔开：");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        mergeSort(nums, 0, nums.length - 1);
        System.out.print("合并排序结果为：");
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[nums.length];
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        for (int p = left; p <= right; p++) {
            nums[p] = temp[p];
        }
    }
}