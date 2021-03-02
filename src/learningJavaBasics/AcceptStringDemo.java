package learningJavaBasics;

import java.util.Scanner;

public class AcceptStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String fName = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String mName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lName = sc.nextLine();

        String fullName = fName+" "+mName+ " "+lName;
        System.out.println("Full Name: "+fullName);

    }
}
