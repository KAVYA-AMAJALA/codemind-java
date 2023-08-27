import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c1=0,c=0,i;
        if(s.charAt(0)>='a'&&s.charAt(0)<='z')
        {
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                c1++;
            }}
            System.out.println(c1+1);
            
        }
        else{
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                c++;
            }}
            System.out.println(c);
        }
        
    }
}
/*port java.util.*;
public class K
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                {
                    c++;
                }
            }
            System.out.println(c+1);
        }
        else
        {
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}*/