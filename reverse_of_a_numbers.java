import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int m=n%10;
            System.out.printf("%d",m);
            n=n/10;
        }
        
          
       
    }
}