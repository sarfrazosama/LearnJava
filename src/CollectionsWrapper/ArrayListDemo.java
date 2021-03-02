package CollectionsWrapper;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();

        //Add items to arraylist
        aList.add(10);
        aList.add("Apple");
        aList.add(65.84);
        aList.add(true);
        aList.add(4,"papaya");
        aList.add(65.84);
        //System.out.println(aList.size());
        //System.out.println(aList);

        //Remove items from arraylist
        aList.remove(0);
        //System.out.println(aList);
        aList.remove(true);
        //System.out.println(aList);

        //Fetch items
        //System.out.println(aList.get(1));
        for (int i=0; i<aList.size(); i++){
            System.out.println(aList.get(i));
        }
        System.out.println("*****************************************");
        for (Object obj: aList){
            System.out.println(obj);
        }

        System.out.println("*****************************************");
        Iterator itr = aList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
