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
        int b,c;
        b=sc.nextInt();
        c=sc.nextInt();
        int k=0;
        for(i=0;i<n;i++)
        {
           if(a[i]<b || a[i]>c)
           {
               k=1;
               System.out.printf("%d ",a[i]);
           }
        }
            if(k==0)
            {
               System.out.printf("-1");
            }
        
    }
}