package test4;
import java.util.Scanner;

public class LongestCommonPrefixDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串数组中的字符串，以,分隔:");
        String input = sc.nextLine();
        String[] data = input.split(",");
        String number = findLongestCommonPrefix(data);
        System.out.println("最长公共前缀是：" + number);
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs.length == 0||strs==null) {
            return "";
        }

        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(ans) != 0) {
                ans = ans.substring(0, ans.length() - 1);
                if (ans.isEmpty()) {
                    return "";
                }
            }
        }

        return ans;
    }
}

