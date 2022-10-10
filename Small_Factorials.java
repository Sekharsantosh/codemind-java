import java.util.Scanner;
class factorial{
    static int fact(int a){
        int k=1,t=0;
        t=a;
        if(t==1)
        {
            k=1;
        }
        else if(t==0)
        {
            k=1;
        }
        else
        {
          t=a*fact(a-1);
          k=t;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int l;
        for(int i=0;i<n;i++)
        {
            int a;
            a=s.nextInt();
            l=fact(a);
            System.out.println(l);
        }
    }
}