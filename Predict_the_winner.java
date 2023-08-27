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
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                s1+=a[i];
            }
            else{
                s2+=a[i];
            }
        }
        int ab=s1-s2;
        if(ab%4==0)
        {
            System.out.println("X");
        }
        else{
            System.out.println("Y");
        }
        
    }
}