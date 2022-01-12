package DataStructures;

import java.util.HashMap;

public class JavaHashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> gameStats = new HashMap<>();
        gameStats.put("James", 100);
        gameStats.put("Ruth", 457);
        gameStats.put("Carolina", 679);

        System.out.println(gameStats);
        System.out.println(gameStats.get("James"));

//        gameStats.clear();
        System.out.println(gameStats);

//        gameStats.remove("Ruth");
        System.out.println(gameStats);

        System.out.println(gameStats.size());

        // Looping through the HashMap
        for (String item: gameStats.keySet()) {
            System.out.println(item);
            System.out.println("Key: " + item + ", value: " + gameStats.get(item));
        }

        for (int item: gameStats.values()) {
            System.out.println(item);
        }
    }
}
