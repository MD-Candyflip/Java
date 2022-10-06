import java.util.Scanner;
public class Primeprint {

    static int count=0;
    
    static boolean check(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }

    static void printprime(int n){
        
        for(int i=2; i<=n; i++){
            if(check(i)==false){
                count++;
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter a range to print prime numbers");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printprime(n);
        scn.close();
        
    }
}
