import java.util.Scanner;
public class K
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k,m;
        n=sc.nextInt();
        k=sc.nextInt();
        m=sc.nextInt();
        int r=k*m;
        int j;
        int e=n/r;
        if(n%r==0)
        {
            System.out.println(e);
        }
        else
        {
            System.out.println(e+1);
        }
        
        
    }
}