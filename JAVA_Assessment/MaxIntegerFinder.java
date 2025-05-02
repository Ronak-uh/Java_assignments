package JAVA_Assessment;

import java.util.ArrayList;
import java.util.Collections;

public class MaxIntegerFinder 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(32);
        numbers.add(59);
        numbers.add(98);
        numbers.add(3);
        numbers.add(66);

        int max = Collections.max(numbers);

        System.out.println("The maximum element : " + max);
    }
}
