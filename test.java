import java.util.Arrays;
import java.util.Scanner;

public class test {
    static int max(int a, int b) {
        if(a==b||a>b)return a;
        return b;
        
    }
    static int min(int a, int b) {
        if(a==b||a<b)return a;
        return b;
    }
    static int BigDiff(int[] nums){
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        return max-min;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int l=scn.nextInt();
        int a[]=new int[l];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<l;i++){
            a[i]=scn.nextInt();
        }
       //int nums[]={7, 7, 6, 8, 5, 5, 6};
       System.out.println("Array : "+Arrays.toString(a));
       System.out.println("Big Difference : "+BigDiff(a));
       scn.close();
    }
}
