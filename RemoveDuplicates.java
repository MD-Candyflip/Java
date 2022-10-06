import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] sortnow(int[] num){
        for(int i=0; i<num.length; i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;                
                }
            }
        }
        return num;
    }

    public static int[] bubblesort(int[] num){
        for(int i=0; i<num.length; i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;                
                }
            }
        }
        return num;
    }

    public static int[] test(int[] n){
        System.out.println("Original Array : "+Arrays.toString(n));
        sortnow(n);
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
        int[] n={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,};
        System.out.println(Arrays.toString(test(n)));
    }
}
