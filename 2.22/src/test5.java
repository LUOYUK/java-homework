import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        subsequence();
    }

    public static void subsequence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();

        System.out.println("请输入单词,中间用”，“隔开:");
        String t = sc.nextLine();
        String[] words = t.split(",");

        int totalcount = 0;
        for (String word:words) {
            int i=0;
            int j=0;
            int count=0;
            while (i < word.length() && j < s.length() && word.length() < s.length()) {
                if (word.charAt(i) == s.charAt(j)) {
                    count++;
                    i++;
                }
                j++;
            }
            if (count == word.length()) {
                System.out.println(word);
                totalcount++;
            }

        }

        System.out.println("s的子序列个数为"+totalcount+"个");

    }
}
