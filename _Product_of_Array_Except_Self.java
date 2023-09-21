import java.util.Scanner;
public class K{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j;
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
     
        for( i=0;i<n;i++){
            int m=a[i];
            int p=1;
            for(j=0;j<n;j++){
                if(a[j]!=m){
                    p=p*a[j];
                }
            }
            System.out.printf("%d ",p);
        }
        
    }
    }

