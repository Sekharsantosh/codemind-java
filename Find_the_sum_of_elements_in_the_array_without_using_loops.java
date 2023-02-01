import java.util.Scanner;
public class file {
    public static void main(String[] args){
        int n,h=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            h=h+a[i];
            
        }
        System.out.println(h);
    }
}