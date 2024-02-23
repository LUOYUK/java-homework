package test4;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成员对应的名字:");
        String name =   sc.nextLine();
        System.out.println("请输入成员对应的学号:");
        int number = sc.nextInt();
        System.out.println("请输入成员的生日（年，月，日");
        int year  = sc.nextInt();
        int month = sc.nextInt();
        int day   = sc.nextInt();


        MyDate b = new MyDate();
        String birthday =b.toString(year,month,day);

        Employee c = new Employee() {
            @Override
            public void earning() {
            }
        };

        System.out.println(c.toString(name,number,birthday));




    }



}
