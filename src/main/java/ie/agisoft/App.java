package ie.agisoft;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
        System.nanoTime();
		System.out.println("Hello World!");
        Test t = new Test();
        long before = System.currentTimeMillis();
		t.hello();
        System.out.println("elapsed " + (System.currentTimeMillis()-before));
	}
}
