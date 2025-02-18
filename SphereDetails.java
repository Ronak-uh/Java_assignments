import java.util.Scanner;

class Sphere 
{
    private double r;
    public Sphere(double r) 
    { 
        this.r = r; 
    }
    public double getVolume() 
    { 
        return (4.0 / 3.0) * Math.PI * r * r * r; 
    }
    public double getSurfaceArea() 
    { 
        return 4 * Math.PI * r * r; 
    }
    public String toString() 
    { 
        return "Radius: " + r + "\nVolume: " + getVolume() + "\nSurface Area: " + getSurfaceArea(); 
    }
}

public class SphereDetails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        System.out.println("\n" + new Sphere(sc.nextDouble()));
        sc.close();
    }
}
