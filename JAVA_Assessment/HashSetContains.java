package JAVA_Assessment;

import java.util.HashSet;

public class HashSetContains {
    public static void main(String[] args) 
    {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");


        String searchElement = "Mango";


        if (fruits.contains(searchElement)) 
        {
            System.out.println(searchElement + " is present in the HashSet.");
        } 
        else 
        {
            System.out.println(searchElement + " is not present in the HashSet.");
        }
    }
}
