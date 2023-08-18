import java.util.Scanner;
public class K
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();

        if(a%4==0)
        {
            System.out.println(a/4);
        }
        else if(a<4)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println((a/4)+1);
        }
        
    }
}