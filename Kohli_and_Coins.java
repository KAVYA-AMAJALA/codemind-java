import java.util.Scanner;
public class C
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n,a,b;
    n=sc.nextInt();
    a=n%10;
    b=n/10;
    
    if(a%5==0)
    {
        int c=b+(a/5);
        System.out.println(c);
    }
    
    else {
        System.out.println("-1");
     }
}
        
}
