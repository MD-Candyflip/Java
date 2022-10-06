import java.util.Scanner;
public class Case_Separation {

    static void test(String str){
        String upper="";
        String lower="";
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>96&&str.charAt(i)<123){
                lower=lower+str.charAt(i);
            }
            if(str.charAt(i)>64&&str.charAt(i)<91){
                upper=upper+str.charAt(i);
            }
        }

        System.out.println("Lowercase string : "+lower);
        System.out.println("Uppercase string : "+upper);

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a string to seperate upper and lower case : ");
        String str=scn.nextLine();
        test(str);
        scn.close();
    }
}
