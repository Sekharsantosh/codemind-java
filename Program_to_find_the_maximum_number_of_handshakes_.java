import java.util.Scanner;
class handshake{
    public static void main(String args[]){
        int n;
        Scanner k =new Scanner(System.in);
        n=k.nextInt();
        int  s=(n*(n-1))/2;
        System.out.println(s);
    }
}