package academy.javadojo.introduction;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("GrapeFruit");
        fruits.add("Banana");
        fruits.add("Blueberry");
        fruits.add("Strawberry");
        fruits.add("Mango");

        fruits.forEach(e -> System.out.println(e.toUpperCase()));



        System.out.println(fruits.size()); //size of the list
        System.out.println(fruits); //retrieve list

        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruits);


    }

}
