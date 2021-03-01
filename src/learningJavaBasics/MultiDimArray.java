package learningJavaBasics;

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] muMulti = new int[2][3];
        muMulti[0][2] = 15;
        System.out.println(muMulti[0][2]);

        int[][] multiSecArray = {{2,3,8},{9,7,6}};
        System.out.println(multiSecArray.length);
        for(int i=0; i<multiSecArray.length; i++){
            for (int j=0; j< multiSecArray[i].length; j++){
                System.out.println(multiSecArray[i][j]);
            }
        }
    }
}
