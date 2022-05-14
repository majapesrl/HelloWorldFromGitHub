//Avtor: Maja Pesrl

//Deklariramo javni razred
public class Steklenica {
	
	
		// Deklariramo lastnosti
		// primitivni podatkovni tipi
		private int kapaciteta; 			// v ml
		private int kolicinaVsebine;		// v ml
		private boolean jeOdprta;
		// deklariramo objekt z imenom barva razreda String
		private String vsebina;
		
		// deklariramo in inicializiramo statično lastnosti
		public static final String material = "steklo";
		
	
		// deklariramo javni konstruktor
		// ustvarimo polno zaprto steklenico
		// parametri: količina vrste vsebine
		// vrača : nov objekt razreda Steklenica
		public Steklenica(int k, String v) {
			
			//Inicializiramo lastnosti
			kapaciteta = k;
			kolicinaVsebine = k;
			jeOdprta = false;
			vsebina = v;
			
			// Izpišemo dogodek
			System.out.println("Ustavarjam steklenico prostornine " + kapaciteta + " ml z vsebino " + vsebina);
		}
		
		// metoda, ki odpre steklenico
		// argumenti: jih ni
		// vrača: uspešnost odpiranja
		public boolean odpri() {
			
			if(jeOdprta)
			{
				System.out.println("Steklenica je ze odprta");
				return false;
			}
			
			System.out.println("Odpiram steklenico...");
			jeOdprta = true;
			return true;
		}
		
		// deklariramo metodo, ki zmanjša količino vsebine
		// parametri: količina, ki jo želimo izprazniti
		// vrača: količina, ki je še ostala
		public int izprazni (int k) {
			
			// če je steklenica odprta
			
			if(jeOdprta == true) {
			
			// če je v steklenici še dovolj vsebine
			if (kolicinaVsebine >= k)
			{
			// od količine vsebine odštejemo količino za praznjenje
			kolicinaVsebine = kolicinaVsebine -k;
			System.out.println("Iz steklenice praznim " + k + " ml");
			}
			
			//Če v steklenici ni dovolj vsebine
			else {
				
				// Izpraznimo vse kar je v steklenici
				kolicinaVsebine = 0;
				System.out.println("Steklenica je prazna!");
				}
			
			}
			// Če je steklenica zaprta
			else {
				System.out.println("Steklenica je zaprta");
			}
			// vrnemo količino, ki je še ostsala
			return kolicinaVsebine;
		}
		
		// getter metoda , ki vrne količino vsebine
		public int getKolicinaVsebine () {
			return kolicinaVsebine;
		}
		
		// getter metoda , ki vrne kapaciteto vsebine
		public int getKapaciteta() {
			return kapaciteta;
		}
}