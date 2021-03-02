package learningJavaBasics;

public class ThisDemo {
    int x=15;
    int y=25;

    public static void main(String[] args) {
        ThisDemo thDem = new ThisDemo();
        thDem.sum();
    }

    public void sum(){
        int x = 10;
        int y = 20;
        System.out.println("Sum of two numbers: "+(x+y));
        System.out.println("Sum of two numbers: "+(this.x+this.y));
    }
}
