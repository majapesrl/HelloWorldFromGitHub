/**
 * Testni razred
 */

/**
 * @author Maja Pesrl
 *
 */
public class HelloWorld {

	/**
	 * @param args - Argumenti iz ukazne konzole
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		PivskaSteklenica ps = new PivskaSteklenica(500, "Laško", "Lager", 4.5);
		
		System.out.println(ps.getNalepka());
	}

}
