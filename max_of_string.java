import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         char c=(s.charAt(0));
         for(int i=0;i<s.length();i++)
         {
             if((int)(s.charAt(i))>(int)c)
             {
                 c=s.charAt(i);
             }
             
         }
         System.out.print(c);
         
        
        
    }
}