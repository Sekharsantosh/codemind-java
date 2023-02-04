import java.util.Scanner;
public class file{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }
}