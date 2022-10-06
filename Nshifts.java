public class Nshifts {

    public static int[] test(int[] num,int n){
        System.out.print("Input Array : ");
        print(num);
        System.out.println();
        for(int k=1;k<=n;k++){
            int first=num[0];
            for(int i=0; i<num.length-1; i++){
                num[i]=num[i+1];
            }
            num[num.length-1]=first;
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
        num=test(num,3);
    }
}
