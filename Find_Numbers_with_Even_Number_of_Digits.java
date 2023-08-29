import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c1=0;
        for(int i=0;i<n;i++)
        {
            int m,c=0;
            while(a[i]!=0)
            {
                 m=a[i]%10;
                c++;
                a[i]=a[i]/10;
            }
            if(c%2==0)
            {
                c1++;
            }
        }
        System.out.println(c1);
        
    }
}