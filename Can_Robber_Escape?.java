import java.util.Scanner;

class file{
    public static void main(String args[]){
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a;
        a=new int[n];
        int i,k;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        k=0;
        for (i=0;i<n;i++)
        {
            if (a[i]<n)
            {
                k=1;
            }
            else
            {
                k=0;
                break;
            }
        }
        if( k==1)
        {
              System.out.println("YES");
        }
        else{
              System.out.println("NO");
        }
    }
}