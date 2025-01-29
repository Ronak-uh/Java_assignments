class PatternGenerator 
{
    void printPattern(int rows) 
    {
        int num = 1; 
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(num + " ");
                num = 1 - num; 
            }
            System.out.println(); 
        }
    }
}


public class PatternDisplay extends PatternGenerator 
{
    public static void main(String[] args) 
    {
        PatternDisplay obj = new PatternDisplay();
        int rows = 4; 
        obj.printPattern(rows); 
    }
}