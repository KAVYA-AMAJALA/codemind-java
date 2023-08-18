import java.util.Scanner;
public class K
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c=21-(a+b);
        if(c<=10)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("-1");
        }
        
    }
}