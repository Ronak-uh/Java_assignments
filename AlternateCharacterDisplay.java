class AlternateCharacterPrinter 
{
    void printAlternateCharacters(String str) 
    {
        System.out.print("Alternate characters: ");
        for (int i = 0; i < str.length(); i += 2) 
        { 
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(); 
    }
}

public class AlternateCharacterDisplay extends AlternateCharacterPrinter 
{
    public static void main(String[] args) 
    {
        AlternateCharacterDisplay obj = new AlternateCharacterDisplay(); 
        String input = "Hello! My name is Ronak."; 
        obj.printAlternateCharacters(input);
    }
}