import java.util.Scanner;
class divisors{
    public static void main(String args[]){
        int n,m,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        k=s.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}