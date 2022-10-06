public class Abstraction {
    public static void main(String[] args) {
        abs_test obj=new abs_test() {
            void run(){
                System.out.println("Running abstract run()");
            }
            void get(){
                System.out.println("Running concrete get()");
            }
        };
        obj.run();
        obj.get();
    }
}

abstract class abs_test{
    abstract void run();
    void get(){}
}
