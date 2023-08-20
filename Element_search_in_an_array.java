import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int g=sc.nextInt();
        
         
         int p=0;
           for(i=0;i<n;i++)
           {
               if(g==a[i])
               {
                 System.out.println("True");
                 p=1;
                   break;
               }
           }
           if(p==0)
           {
               System.out.println("False");
           }
    }
}