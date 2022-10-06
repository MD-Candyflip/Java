import java.util.Scanner;
public class Scanner_class {
	
	static void test(int a,String b) {
		System.out.println("INT : "+a);
		System.out.println("STRING : "+b);
	}
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);

		System.out.print("Enter an integer");
		int a=scn.nextInt();
        
        System.out.print("Enter a String");
		String b=scn.nextLine();
        scn.close();
		
		
		
		
		
		scn.close();
		test(a,b);
	}
}
