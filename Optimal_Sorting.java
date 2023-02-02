import java.util.Scanner;
import java.util.Arrays;
public class file{
    static void check(int[] a,int n){
        int s,k=0,h;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                k=1;
            }
        }
        int t=0,l=0;
        if(k==1){
             Arrays.sort(a);
             t=a[0];
             l=a[n-1];
             System.out.println(l-t);
        }
        else{
              System.out.println(0);
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       // int a[]=new int[n];
       // int curr=0,k=0;
        for(int i=0;i<n;i++)
        {
           
           int m;
           m=sc.nextInt();
           int a[]=new int[m];
           for(int j=0;j<m;j++)
           {
               a[j]=sc.nextInt();
           }
           check(a,m);
        }
        
        
    }
}