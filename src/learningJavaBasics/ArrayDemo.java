package learningJavaBasics;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[0] = 65;
        myIntArray[1] = 12;
        myIntArray[2] = 22;
        myIntArray[4] = 24;

        //System.out.println(myIntArray[3]);
        //System.out.println(myIntArray.length);

        int[] myArray = {12,15,18,16};
        //System.out.println(myArray[2]);

        int[] loopArray = {2,16,19,25,65,74,96,97,10,34};
        for(int x=0; x < loopArray.length; x++){
            System.out.println(loopArray[x]);
        }
    }
}
