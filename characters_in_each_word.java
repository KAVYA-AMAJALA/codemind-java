import java.util.Scanner;
public class K
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
                System.out.print(a[i].length()+" ");
        }
    }
}