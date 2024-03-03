import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(nums, result, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        String input = sc.nextLine();
        input = input.replaceAll("[\\[\\]]", ""); // 去除方括号
        String[] strNums = input.split(",");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        List<List<Integer>> subsets = subsets(nums);
        System.out.println("输出"+subsets);
        sc.close();
    }
}