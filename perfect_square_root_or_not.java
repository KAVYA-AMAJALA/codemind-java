import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1,p=0;
        for(int i=1;i<n;i++)
        {
            m=i*i;
        
        if(m==n)
        {
           p=1;
        }
        }
        if(p==0)
        {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        
          
       
    }
}