class College {
    int cno;
    String cname;
    String cadd;

    public void setCollegeDetails(int cnoInput, String cnameInput, String caddInput) 
    {
        cno = cnoInput;
        cname = cnameInput;
        cadd = caddInput;
    }

    public void displayCollegeDetails() 
    {
        System.out.println("College No: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + cadd);
    }
}

class Department extends College 
{
    int dno;
    String dname;

    public void setDepartmentDetails(int dnoInput, String dnameInput) 
    {
        dno = dnoInput;
        dname = dnameInput;
    }

    public void displayDepartmentDetails() 
    {
        displayCollegeDetails();
        System.out.println("Department No: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class CollegeDep 
{
    public static void main(String[] args) 
    {
        Department dept = new Department();

        dept.setCollegeDetails(101, "ABC Engineering College", "New Delhi");
        dept.setDepartmentDetails(1, "Computer Science");

        dept.displayDepartmentDetails();
    }
}