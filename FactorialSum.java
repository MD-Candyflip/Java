import java.util.*;
class FactorialSum{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number if u wanna know its SpecialAF");
        int num=scn.nextInt();
        if(num==FacSum(num))System.out.println("The number is specialAF");
        else System.out.println("The number aint SpecialAF");
        scn.close();

    }

    static int fac(int a){
        int b=1;
        for(int i=a; i>0;i--){
            
            b=b*i;
        }
        return b;
    }

    static int FacSum(int num){
        int r;
        int s=0;
        while(num>0){
            r=num%10;
            int b=fac(r);
            s=s+b;
            num=num/10;
        }
        return s;
    }
}
