package CollectionsWrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        int x = 15;

        Integer num = new Integer(x); //Wrapping
        System.out.println(num);

        int y = num;                  //Unwrapping
        System.out.println(y);
    }
}
