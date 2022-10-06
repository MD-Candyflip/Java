public class Alpha_Pattern {

    static void pattern(int n){
        int i=n;
        while(i>0){
            int alphabets=65;
            int j=0;
            while(j<i){
                System.out.print((char)(alphabets+j)+" ");
                j++;
            }
            System.out.println();
            i--;
        }
        i=0;
        while(i<n){
            int alphabets=65;
            int j=0;
            while(j<=i){
                System.out.print((char)(alphabets+j)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
