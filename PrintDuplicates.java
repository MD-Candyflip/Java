import java.util.Arrays;

public class PrintDuplicates {

    static int[] test(int[] num){
        Arrays.sort(num);
        System.out.println("Original Array : "+Arrays.toString(num));
        int count=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
            if(num[i]==num[j]){
                //System.out.println(num[i]);
                count++;
            }
            }
        }
        int[] arr=new int[count];
        int k=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
            if(num[i]==num[j]){
                arr[k]=num[j];
                k++;
            }
            }
        }
        return arr;
    }

    public static int[] test2(int[] n){
        //System.out.println("Original Array : "+Arrays.toString(n));
        Arrays.sort(n);
        int count = 0;
        for(int i=0;i<n.length;i++){
            if(i==0||n[i]!=n[i-1]){
                //System.out.println(n[i]);
                count++;
            }
        }
        //System.out.println(count);
        int[] res=new int[count];
        //System.out.println(Arrays.toString(res));
        int j=0;
        for(int i=0;i<n.length;i++){
            if(i==0||n[i]!=n[i-1]){
                res[j]=n[i];
                j++;
            }
        }
        return res;
        //System.out.println("Array without duplicates: "+Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] num={1,1,2,3,4,4,5,6,7,4,3};
        System.out.println("Repeated elements : "+Arrays.toString(test2(test(num))));
    }
}
