import java.util.Scanner;
public class k{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x,y;
        for(int i=0;i<t;i++)
        {
         x=sc.nextInt();
         y=sc.nextInt();
        
             if(x%y==0)
            {
            System.out.println(x/y);
             }
             else {
                 System.out.println((x/y)+(x%y));
                }
        }
        
    }
}