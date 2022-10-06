import java.util.Scanner;
class divisible{
    public static void main(String args[]){
        int n,k;
        int c=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(a[i]%k==0)
            {
                c=c+1;
            }
        }
        
        System.out.println(c);
    }
}