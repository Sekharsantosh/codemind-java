import java.util.Scanner;
class Square_root{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k;
        k=0;
        for(int i=1;i<n;i++)
        {
            if(i*i<=n)
            {
                k=i;
            }
        }
        if(n==k*k)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}