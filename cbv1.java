public class cbv1 {
    int m=99;
    void cbv2(int n){
        m=n-16;
        
    }
    public static void main(String[] args) {
        cbv1 x=new cbv1();
        System.out.println(x.m);
        x.cbv2(88);
        System.out.println(x.m);
    }
}

