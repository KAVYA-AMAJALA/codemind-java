import java.util.Scanner;
public class M{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a==b||a==c||a==d||a==(b+c)||a==(c+d)||a==(d+b)||a==(b+c+d))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}