import java.util.Scanner;
public class B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int m=b*c;
        
        if(m>=a)
        {
            System.out.println("YES");
        }
        
        else{
            System.out.println("NO");
        }
    }
}