import java.util.Scanner;
class Electricity_Bill{

    static int bill(int u){
        int s=0;
        if(u>0&&u<=100){
            s=u*0;
        }
        if(u>100&&u<=200){
            s=(u-100)*5;
        }
        if(u>200){
            s=500+(u-200)*10;
        }
        return s;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number of units used : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print("Electricity bill is : "+bill(n)+" Rupees");
        scn.close();
    }
}