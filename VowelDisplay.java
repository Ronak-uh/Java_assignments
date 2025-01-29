
class VowelFinder {
    void printVowels(String str) {
        System.out.print("Vowels in the given string: ");
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println(); 
    }

    boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; 
    }
}

public class VowelDisplay extends VowelFinder {
    public static void main(String[] args) {
        VowelDisplay obj = new VowelDisplay(); 
        String input = "Hello! My name is Ronak."; 
        obj.printVowels(input); 
    }
}