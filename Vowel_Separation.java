import java.util.Scanner;

public class Vowel_Separation {

    static void test(String str){
        //str=str.toLowerCase();
        String vowel = "aeiouAEIOU";
        String a="";
        String b="";
        for(int i=0; i<str.length(); i++){
            boolean isvowel = false;
            for(int j=0; j<vowel.length(); j++){
                if(str.charAt(i)==vowel.charAt(j)){
                    a=a+str.charAt(i);
                    isvowel = true;
                }
            }
            if(isvowel==false){
                b=b+str.charAt(i);
            }
        }
        System.out.println("Vowel String :"+a);
        System.out.println("Consonant String :"+b);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a string to seperate vowels and consonents: ");
        String str=scn.nextLine();
        test(str);
        scn.close();
    }
}
