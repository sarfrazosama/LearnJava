package learningJavaBasics;

public class TryCatchDemo {
    int a = 10;
    int b = 5;

    public static void main(String[] args) {

        try{
            int x = 15;
            int y = 20;
            System.out.println("Division: "+(x/0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot divide by zero");
        }
        TryCatchDemo demo = new TryCatchDemo();
        demo.multiply();
    }

    public void multiply(){
        System.out.println("Multiplication: "+(this.a * this.b));
    }
}
