public class Labelled {
    public static void main(String[] args)
    {
        int i = 0;
        Loop:
        while (i<=5){
        System.out.println(i);
        i++;
        if (i==2)
        {
            break Loop;
        }
        }
    }
}
