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
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int avg=sum/n;
        int c=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                c++;
            }
        }
       
            System.out.println(c);
        
        
                
    }
}