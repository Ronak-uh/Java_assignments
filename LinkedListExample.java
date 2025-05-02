import java.util.*;
public class LinkedListExample {
    public static void main(String []args){
        LinkedList<String> fruits =new LinkedList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("melon");
        fruits.add("watermelon");
        fruits.add("tomato");
        System.out.println(fruits);
        fruits.addFirst("carrit");
        fruits.addLast("banana");
        fruits.removeLast();
        fruits.removeFirst();
        System.out.println(fruits);
        fruits.removeLast();
        fruits.removeFirst();
        System.out.println(fruits);
    }
}