import java.util.Scanner;
import java.lang.*;
class sum_and_product{
    public static void main(String args[]){
        int n,k,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        m=s.nextInt();
        double d=0;
        d=Math.pow(n,k);
        double l=d%m;
        int f=(int)l;
        System.out.println(f);
    }
}