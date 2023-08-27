import java.util.Scanner;
public class K{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            System.out.print(ch);
        }
        
        
    }
}