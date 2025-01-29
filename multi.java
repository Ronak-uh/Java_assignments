import java.util.Scanner;

class multi
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3,4},{10,20,30,40}};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
        }
        sc.close();
    }
}
