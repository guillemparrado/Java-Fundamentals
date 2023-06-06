package cat.barcelonactiva.itacademy.Collections.Ex2;

import java.util.SortedSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        SortedSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Pizza Hut", 100));
        restaurants.add(new Restaurant("Burger King", 200));
        restaurants.add(new Restaurant("McDonalds", 300));

        restaurants.add(new Restaurant("Pizza Hut", 100));
        restaurants.add(new Restaurant("Pizza Hut", 200));


        if(restaurants.size() == 4)
            System.out.println("Es comprova que el Set no accepta duplicats");
        else
            System.out.println("Implementació incorrecta de detecció de duplicats");

        // Es comprova que els restaurants es troben correctament ordenats
        for(Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }
    }
}
