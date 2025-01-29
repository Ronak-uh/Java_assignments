
class AlphabetPrinter 
{
    void printAlphabets()
    {
        char ch = 'A';
        while (ch <= 'Z') 
        { 
            System.out.print(ch + " ");
            ch++; 
        }
        System.out.println(); 
    }
}

public class AlphabetDisplay extends AlphabetPrinter
 {
    public static void main(String[] args)
    {
        AlphabetDisplay obj = new AlphabetDisplay(); 
        obj.printAlphabets(); 
    }
}