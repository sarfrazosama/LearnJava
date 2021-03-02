package Abstraction;

public class Circle extends Shapes{
    public static void main(String[] args) {
        Circle ce = new Circle();
        ce.drawShape();
        ce.colorShape();
        ce.moveShape();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing circle");
    }
}
