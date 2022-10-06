import java.util.Scanner;
class string_reverse{
    public static void main(String[] args) {
        System.out.println("Enter the string to be reversed");
        Scanner scn=new Scanner(System.in);
        String original=scn.nextLine();
        String reverse="";
        int l=original.length();
        for(int i=l-1; i>=0; i--) {
            reverse+=original.charAt(i);
            
    }
    System.out.println("The reversed string of "+original+" is "+reverse);
    scn.close();
}
}