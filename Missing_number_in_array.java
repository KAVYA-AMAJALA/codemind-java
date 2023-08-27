import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        for( i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
        }
        
         int sum=0;
        for(i=0;i<n-1;i++)
        {
            sum+=a[i];
        }
        
         int m=(n*(n+1))/2;
         int r=Math.abs(m-sum);
         
         System.out.println(r);
       
        }
        
        
    }
}