import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            double a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            double c1=c/a;
            double c2=d/b;
            if(c1<c2)
            {
                System.out.println("-1");
            }
            else if(c1==c2)
            {
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }
        
        
    }
}