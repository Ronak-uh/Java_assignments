class PatternGenerator 
{
    void printPattern()
     {
        for (int i = 5; i >= 1; i--)
         {
            for (int j = i; j <= 5; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


public class NumberPattern extends PatternGenerator 
{
    public static void main(String[] args)
     {
        NumberPattern pattern = new NumberPattern(); 
        pattern.printPattern(); 
    }
}