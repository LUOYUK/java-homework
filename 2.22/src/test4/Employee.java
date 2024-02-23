package test4;

import java.util.Scanner;

public abstract class Employee extends MyDate{
    public String name;
    public int number;

    MyDate s = new MyDate();
    String birthday = s.toString();

    public Employee(String name, int number, MyDate s, String birthday) {
        this.name = name;
        this.number = number;
        this.s = s;
        this.birthday = birthday;
    }

    public Employee() {

    }

    public abstract void earning();

    public String toString(String name, int number,String birthday) {
        return "Employee:"+name+","+number+","+birthday;

    }





















}
