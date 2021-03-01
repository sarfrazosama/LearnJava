package learningJavaBasics;

public class ConditionsDemo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 14;

        if(num1>num2){
            System.out.println("Num1 is greater");
        }

        else if(num1==num2){
            System.out.println("Both are equal");
        }

        else {
            System.out.println("Num2 is greater");
        }
    }
}
