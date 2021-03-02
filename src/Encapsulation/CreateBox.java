package Encapsulation;

public class CreateBox {
    public static void main(String[] args) {

        Common co = new Common();
        int x = co.setLength(15);
        int y = co.setWidth(12);
        int z = co.setHeight(20);
        int a = co.setHeight(-10);

        co.setBoxDimension(x,y,z);
        co.setBoxDimension(x,y,a);
    }
}
