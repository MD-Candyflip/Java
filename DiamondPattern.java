public class DiamondPattern {

    static void pattern(int n){
        //int k=n;
        for(int i=0; i<n; i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int x=0;x<i;x++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int x=n;x>i;x--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
}
