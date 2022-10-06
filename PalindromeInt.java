public class PalindromeInt {
    public static void main(String[] args) {
        int n=123;
        int p=0;
        int q=n;
        while(n>0){
            int r=n%10;
            p=p*10+r;
            n=n/10;
        }
        if(p==q){
        System.out.println("The number "+q+" is a palindrome");}
        else {
            System.out.println("The number "+q+" is not  a palindrome");
        }
    }
}
