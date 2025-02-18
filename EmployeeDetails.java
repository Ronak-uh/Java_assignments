import java.util.Scanner;

class Employee {
    String empId, empName, empDesignation, empSal;

    void setDetails(String id, String name, String designation, String salary) {
        empId = id; 
        empName = name;
        empDesignation = designation;
        empSal = salary;
    }

    void getDetails(String id, String name, String designation, String salary) 
    {
        System.out.println("\nEmployee Details:");
        System.out.println("\nEmployee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Designation:"+empDesignation);
        System.out.println("Employee Salary:"+empSal);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();
        
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        
        System.out.print("Enter Employee Designation: ");
        String empDesignation = sc.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        String empSal = sc.nextLine();
        
        emp.setDetails(empId, empName, empDesignation, empSal);
        emp.getDetails(empId, empName, empDesignation, empSal);
        
        sc.close();
    }
}
