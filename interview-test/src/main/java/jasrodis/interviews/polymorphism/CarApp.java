package jasrodis.interviews.polymorphism;

public class CarApp {

	public static void main(String args[]) {
		Car b = new Bmw(); // This will print "This is a car!"
		b.run();
	}

}
