import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        int c=0,p=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
               p=1;
                c++;
            }
        }
        if(p==1)
        {
        System.out.print(c);}
        else{
            System.out.println("-1");
        }
        
        
    }
}