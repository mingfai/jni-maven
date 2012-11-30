package ie.agisoft;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
        Test t = new Test();
        long before = System.nanoTime();
		t.hello();
        System.out.println("elapsed " + (System.nanoTime()-before));
	}
}
