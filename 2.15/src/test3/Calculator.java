package test3;

public class Calculator {
    private  double a;
    private  double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add(){
        double c;
        c = a + b;
        System.out.println("Addition:" + c);
        return c;
    }

    public double subtract(){
        double c;
        c = a - b;
        System.out.println("subtraction:" + c);
        return c;
    }

    public double multiply(){
        double c;
        c = a * b;
        System.out.println("Multiplication:" + c);
        return c;
    }

    public double divide(){
        double c;
        c = a / b;
        System.out.println("Division:" + c);
        return c;
    }





}
