import java.util.Scanner;
public class k{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
     
    while(n>0){    
    int m=n%10;
     n=n/10;
     System.out.print(m);
     }
     
}
    }