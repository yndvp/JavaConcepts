package DataStructures;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Both ways are possible

        ArrayList<String> names = new ArrayList<>();
//        nickname.add(2); // -> impossible
        names.add("James");
        names.add("Bonni");
        names.add("Bond");
        names.add("Arnold");

        ArrayList name = new ArrayList();
        name.add(1);
        name.add("James");
        name.add("Bonni");
        name.add("Bond");
        name.add("Arnold");
        name.remove("James");
        name.remove(0);

        System.out.println(name);

        // Get element
        System.out.println(name.get(0));

        // Looping through ArrayList
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Name: " + name.get(i));
        }

        // Clever for loop
        for(Object item : name){
            System.out.println(item);
        }
    }
}
