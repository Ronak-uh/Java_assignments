public class Strin {
    public static void main(String[] args) 
    {
        String x="Hello World!";
        System.out.println("Original String : "+x);

        // 1. contains()
        System.out.println(x.contains("s"));

        // 2. join()
        String y= String.join(" ","Sourabh","is","our","CR");
        System.out.println("Join function example : "+y);

        // 3. replace()
        String z = x.replace("World","Mohammad");
        System.out.println("Replace function example : "+z);

        // 4. indexOf)
        System.out.println(x.indexOf("o"));

        // 5. toUpperCase()
        System.out.println(x.toUpperCase());
    }
}

