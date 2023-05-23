class A {
	void info() {
		System.out.println("My name is Adarsh ");
	}
}

class B extends A {
	void info() {
		System.out.println("My name is Adarsh Mishra ");
	}
}

public class overridding {
	public static void main(String[] args) {
		B ob = new B();
		ob.info();
	}
}
