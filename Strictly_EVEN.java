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
        int c=0,c1=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0 && i%2==0)
            {
                c++;
            }
            if(a[i]%2==0)
            {
                c1++;
            }
        }
        if(c==c1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
                
    }
}