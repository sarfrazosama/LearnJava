package Inheritance;

public class Child1 extends BaseParent{
    public static void main(String[] args) {

        BaseParent bP = new BaseParent();
        bP.method1();
        bP.method2();
    }

    public void childMethod(){
        System.out.println("Child Method");
    }
}
