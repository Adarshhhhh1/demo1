
abstract class Car {
	abstract void run();
}

class Supercar extends Car {
	void run() {
		System.out.println("running safely");
	}
}

public class abtract {
		public static void main(String[] args) {
			 Car obj = new Supercar();  
			 obj.run();  
		}
}
