package Encapsulation;

public class Common {
    
    private int length;
    private int width;
    private int height;

    public void setBoxDimension(int l, int b, int h){
        System.out.println("Box created with dimension: "+l +"cm " +b +"cm "+ h +"cm" );
    }

    public int setLength(int l){
        if (l>1){
            length=l;
        }
        else {
            System.out.println("Invalid Length");
        }
        return length;
    }

    public int setWidth(int b){
        if (b>1){
            width=b;
        }
        else {
            System.out.println("Invalid Width");
        }
        return width;
    }

    public int setHeight(int h){
        if (h>1){
            height=h;
        }
        else {
            System.out.println("Invalid Height");
        }
        return height;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

}
