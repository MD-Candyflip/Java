class Sumofdigits{
    public static void main(String[] args) {
        int n=123;
        int n1=n;
        int s=0;
        while(n>0){
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("Sum of digits of "+n1+" is "+s);
    }
}