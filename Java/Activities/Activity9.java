package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> objList = new ArrayList<String>();
        //Adding objects to Array List at default index
        objList.add("Apple");
        objList.add("Mango");
        objList.add("Orange");
        //Adding object at specific index
        objList.add(3, "Grapes");
        objList.add(1, "Papaya");

        System.out.println("Print All the Objects:");
        for(String s:objList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + objList.get(2));
        System.out.println("Is Chicku is in list: " + objList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + objList.size());

        objList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + objList.size());
    }
}