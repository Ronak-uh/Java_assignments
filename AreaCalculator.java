class Shape 
{
    void areaSquare(double side) 
    {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }


    void areaCircle(double radius) 
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


public class AreaCalculator extends Shape 
{
    public static void main(String[] args) 
    {
        AreaCalculator obj = new AreaCalculator(); 
        double squareSide = 5.0;  
        double circleRadius = 3.0;

        obj.areaSquare(squareSide); 
        obj.areaCircle(circleRadius); 
    }
}