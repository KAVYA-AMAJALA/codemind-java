import java.util.Scanner;
public class k{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n1;
    n1=sc.nextInt();
     for(int i=1;i<=n1;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
         System.out.println();
     }
     }

    }