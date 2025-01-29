public class swap3 {
    public  static void even(){
        int a = 10;
        int b=20;
        System.out.println("Befor swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);       
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
    System.out.println("a="+a);
    System.out.println("b="+b);

    }
    public static void main(String[] args) {
        swap3.even();

    }
}
