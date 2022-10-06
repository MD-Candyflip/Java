public class Pattern {

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            System.out.print(i+" ");
            int l=i-1;
            int k=n-1;
            int r=i;
            while(l>0){
                System.out.print(r+k+" ");
                r=r+k;
                l--;
                k--;
                
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(6);
        
    }
}
