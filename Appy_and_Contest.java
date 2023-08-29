import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++){
            long n=sc.nextLong();
        long a=sc.nextLong();
          long b=sc.nextLong();
           long k=sc.nextLong();
           long  c=0,m=0;
           for(long i=1;i<=n;i++)
           {
               if(i%a==0 && i%b!=0)
               {
                   c++;
               }
               else if(i%a!=0&& i%b==0)
               {
                   c++;
               }
               if(c>=k)
               {
                   System.out.println("Win");
                   m=1;
                   break;
               }
               
           }
           if(m==0)
           {
               
               System.out.println("Lose");
           }

        }
         
    }
}