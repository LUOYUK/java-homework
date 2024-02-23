import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入N个整数，中间用,隔开:");

        String input = sc.nextLine();
        String[] data = input.split(",");

        int[] nums = new int[data.length];
        int sum = 0;
        int count = data.length;
        for (int i = 0; i < data.length; i++) {
            nums[i] = Integer.parseInt(data[i]);

            if(nums[i]<0){
                System.out.println("N必须是正数或0,请重新输入");
                nums[i] = sc.nextInt();
            }
             sum +=nums[i];
        }
        System.out.println((double)sum/count);
    }
}

