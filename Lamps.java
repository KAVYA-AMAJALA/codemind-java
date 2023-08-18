import java.util.Scanner;
public class M{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x,y,k;
        n=sc.nextInt();
        k=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
       
        int r=n-k;
        int red=k*x;
        int rem1=r*x;
        int rem2=r*y;
        int c;
        if(rem1<rem2)
        {
            c=red+rem1;
            System.out.println(c);
        }
        else{
            c=red+rem2;
            System.out.println(c);
        }
        
    }
}