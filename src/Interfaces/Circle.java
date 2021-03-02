package Interfaces;

public class Circle implements Shapes{
    public static void main(String[] args) {
        Circle cle = new Circle();
        cle.method1();
        cle.method2();
        cle.method3();
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }
}
