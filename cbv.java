public class cbv {
    int m=99;
    void cbv1(int m){
        this.m=m-16;
        System.out.println(this.m);
        
    }
    public static void main(String[] args) {
        cbv x=new cbv();
        System.out.println(x.m);
        x.cbv1(88);
        System.out.println(x.m);
    }
}
