import java.util.Scanner;
class neon_number{
    public static void main(String args[]){
        int n;
        int t=0,r,s=0;
        Scanner k=new Scanner(System.in);
        n=k.nextInt();
        t=n*n;
        while(t!=0)
        {
            r=t%10;
            s=s+r;
            t=t/10;
        }
        if(s==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
             System.out.println("Not Neon Number");
         }
    }
}