public class RightShift {

    public static int[] test(int[] num,int n){
        System.out.print("Input Array : ");
        print(num);
        System.out.println();
        for(int k=1;k<=n;k++){
            int last=num[num.length-1];
            for(int i=num.length-1; i>0; i--){
                num[i]=num[i-1];
            }
            num[0]=last;
        }
        System.out.print("Output Array : ");
        print(num);
        return num;
    }

    public static void print(int[] num){
        System.out.print("[ ");
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.print("]");

    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        num=test(num,9);
        //System.gc();
    }
}
