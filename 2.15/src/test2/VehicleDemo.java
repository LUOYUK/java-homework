package test2;

import java.util.Scanner;

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle() { };
        System.out.println("车的颜色为:");
        String colour = sc.nextLine();
        System.out.println("车的品牌为:");
        String brand = sc.nextLine();
        System.out.println("车的速度为:");
        int speed = sc.nextInt();
        v.setColour(colour);
        v.setBrand(brand);
        v.setSpeed(speed);

        v.start(colour,brand);
        v.accelerate(colour,brand,speed);
        v.brake(colour,brand);

        System.out.println("请输入车轮的个数:");
        int wheels = sc.nextInt();
        System.out.println("请输入车的实载人数:");
        int loader = sc.nextInt();
        System.out.println("请输入车的已载重量:");
        int payload = sc.nextInt();
        noticeMessage(wheels,loader,payload );


    }


    public static void noticeMessage(int wheels,int loader,int payload) {
        while (true) {
            Car c = new  Car();
            Truck t = new Truck();

            if (wheels == 4) {
                System.out.println("车轮的个数是4:");
                c.setLoader(loader);
                System.out.println("这是一辆小车，能载5人，实载" + c.getLoader() + "人。");
                if (loader > 5) {
                    System.out.println("你超员了！！！");
                } else if (loader < 1) {
                    System.out.println("你输入的数据有误!!!");
                }
                break;

            } else if (wheels == 6) {
                System.out.println("车轮的个数是6:");
                t.setLoader(loader);
                System.out.println("这是一辆卡车，能载3人，实载" + t.getLoader() + "人。");
                if (loader > 3) {
                    System.out.println("你超员了！！！");
                } else if (loader < 1) {
                    System.out.println("你输入的数据有误!!!");
                }
                t.setPayload(payload);
                System.out.println("这是一辆卡车，核载5000kg，实载" + t.getPayload() + "kg。");
                if (payload > 5000) {
                    System.out.println("你超载了！！！");
                } else if (loader < 0) {
                    System.out.println("你输入的数据有误!!!");
                }

                break;

            } else {
                System.out.println("你输入的数据有误!!!");
                break;
            }
        }
    }




    }

