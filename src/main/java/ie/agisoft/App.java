package ie.agisoft;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
        Test t = new Test();
        t.hello();

        long before = System.nanoTime();
        for (int i=0; i < 1000000; i++ ) t.hello();
        System.out.println("called 1M times, elapsed " + (System.nanoTime()-before)/1000/1000 + "ms");//"µs
	}
}
