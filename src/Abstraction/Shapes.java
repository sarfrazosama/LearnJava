package Abstraction;

public abstract class Shapes {

    public abstract void drawShape();

    public void colorShape(){
        System.out.println("Coloring Shape");
    }

    public void moveShape(){
        System.out.println("Moving Shape");
    }
}
