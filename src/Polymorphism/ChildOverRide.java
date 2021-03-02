package Polymorphism;

public class ChildOverRide extends ParentOverRide{
    public static void main(String[] args) {
        ChildOverRide child = new ChildOverRide();
        child.methodParent();
    }

    public void methodParent(){
        System.out.println("Parent class Method--Overridden in Child Class");
    }
}
