import java.util.Scanner;
class farenheit{
    public static void main(String args[]){
        int n;
        double f;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        f=32+(n*(1.8));
        System.out.format("%.2f",f);
        
        
    }
}