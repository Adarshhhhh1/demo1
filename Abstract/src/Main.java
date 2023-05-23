
class S{
	void meth(int a , int b){
		System.out.println(" A + B = "+(a+b));
	}
	void meth(int a , int b, int c){
		System.out.println(" A + B + C = "+(a+b+c));
		System.out.println("hello");
	}
}


public class Main {
	public static void main(String[] args) {
		S ob = new S();
		ob.meth(5, 6);
		
	}

}
