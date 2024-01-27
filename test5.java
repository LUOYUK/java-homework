import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        arraysDemo();
    }

    public static  void arraysDemo()
    {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(20);
            //在此处修改随机生成数大小的范围
        }

        System.out.println("随机数组：");
        for (int num : arr) {
            System.out.println(num);
        }

        int max = arr[0];
        for(int n = 0;n < 10;n++){
            if(max < arr[n]){
                max = arr[n];
            }
        }
        System.out.println("数组最大值为："+max);

        int min = arr[1];
        for(int m = 0;m < 10;m++){
            if(min > arr[m]){
                min = arr[m];
            }
        }
        System.out.println("数组最小值为："+min);

        int s = max+min;
        System.out.println("数组中包含元素的最大值最小值之和为:"+s);
    }
}