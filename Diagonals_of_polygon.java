import java.util.Scanner;
class polygon{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=0;
        k=(n*(n-3))/2;
        System.out.println(k);
    }
}