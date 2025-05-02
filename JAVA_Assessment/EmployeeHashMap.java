package JAVA_Assessment;

import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String[] args) 
    {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(104, "David");

        System.out.println("Employee ID to Name Mapping: " + employees);

        int searchId = 103;
        if (employees.containsKey(searchId)) 
        {
            System.out.println("Employee with ID " + searchId + " is " + employees.get(searchId));
        } 
        else 
        {
            System.out.println("Employee ID " + searchId + " not found.");
        }
    }
}
