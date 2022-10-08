import java.util.Scanner;
class pronic{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k;
        k=0;
        int c=n;
        int i=0,j=i+1;
        while(c!=0)
        {
            if(i*j==n)
            {
                k=1;
                break;
            }
            i+=1;
            j+=1;
            c-=1;
        }
        if(k==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}