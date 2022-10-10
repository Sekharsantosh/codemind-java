import java.util.Scanner;
class minimum_of_array{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=a[0];
        for(int i=0;i<n;i++)
        {
            if(k>a[i])
            {
                k=a[i];
            }
        }
        System.out.println(k);
    }
}