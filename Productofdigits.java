public class Productofdigits {
    public static void main(String[] args) {
        int n=123;
        int p=1;
        int q=n;
        while(n>0){
            int r=n%10;
            p=p*r;
            n=n/10;
        }
        System.out.println("The product of digits of "+q+" is "+p);
    }
}
