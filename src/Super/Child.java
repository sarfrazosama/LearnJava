package Super;

public class Child extends Parent{

    String name = "Mark";
    int empId = 12345;
    //String name = super.name;
    //int empId = super.empId;

    public static void main(String[] args) {
        Child ch = new Child();
        ch.employee();
    }

    public void employee(){
        //super.employee();
        System.out.println(name);
        System.out.println(empId);
    }
}
