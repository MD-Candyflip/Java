import java.util.*;
public class CircularPrime {

    static boolean check(int n){
        int m=n;
        int d=0;
        // counting the number of digits in the given number and storing it in "d"
        while(m>0){
            m=m/10;
            d++;
        }
        // determining the factor by which the last digit of the number should be multiplied by ie. "a"
        int a=1;
        while(d>1){
            a=a*10;
            d--;
        }
        // rotating the given number and checking if each of the rotated values are prime or not
        int rotate=n;
        while(n>0){

            int r=rotate%10;
            int b=rotate/10;
            rotate=r*a+b;
            for(int j=2; j<rotate; j++){
                if(rotate%j==0){
                    return true; // if the rotated value is not a prime then we return true
                }
            }
            n=n/10;
        }
        
        return false; // if the number and its rotated values are prime then we return false
    }
    public static void main(String[] args) {
        System.out.print("Enter a number to find out if its circular prime : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(check(n)==true)System.out.println(n+" is not a circular prime");
        else System.out.println(n+" is a circular prime");
        scn.close();
    }
}
