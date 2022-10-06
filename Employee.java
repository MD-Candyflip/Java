

abstract class Employee {
	abstract void work();
}

class Solution{
	public static void main(String[] args) {
		Employee emp=new Employee() {
			@Override
			void work() {
				System.out.println("Working");
			}
		};
		emp.work();
	}
}