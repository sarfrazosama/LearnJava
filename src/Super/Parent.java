package Super;

public class Parent {
    String name = "Peter";
    int empId = 648787;

    public Parent(){
        System.out.println("Parent Constructor");
    }

    public Parent(int x){
        System.out.println("Parametrized Constructor");
    }

    public void employee(){
        System.out.println(name);
        System.out.println(empId);
    }
}
