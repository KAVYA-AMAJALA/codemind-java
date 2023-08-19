import java.util.Scanner;
public class k
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int intArray[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            intArray[i]=sc.nextInt();
        }
         int sum=0;
         for(int j:intArray)
         {
             sum+=j;
         }
         System.out.println(sum);
    }
}