import java.util.Scanner;
public class AlternatePrime {

    static boolean isprime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean isodd(int n){
        if(n==1)return true;
        if(n%2==0)return false;
        return true;
    }

    static void print(int n){
        int count = 0;
        for(int i=2; i<=n; i++){
            if(isprime(i)==true){
                count++;
                if(isodd(count)==true){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number till which to print alternating prime numbers : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        print(n);
        scn.close();
    }
}
