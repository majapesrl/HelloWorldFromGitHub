// deklariramo javni razred PivskaSteklenica, 
// ki razširja  razred Steklenica (od nje podeduje vse lastnosti in metode)
// in implementira vmesnik AlkoholnaPijaca 
// 						(ki prepisuje katere metode morajo biti implementirane)
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
	
	// vse lastnosti, ki jih imajo ostale steklenice
	// dodatne lastnosti, ki veljajo le za pivske steklenice:
	private double stopnjaAlkohola; // v odstotkih
	private String proizvajalec;
	private String stil;
	private double temperatura; // v st. C
	
	// Konstruktor
	// vhodi: velikost steklenice, proizvajalec, stil, alkohol
	// vrne: nov objekt tipa PivskaSteklenica
	public PivskaSteklenica(int k, String p, String s, double a) {
		
			// pokličemo konstruktor nadrazreda
			super(k, "Pivo");
			
			// pivo vzamemo iz hladilnika
			temperatura = 8.0;
			
			
			// inicializiramo dodatne lastnosti
			stopnjaAlkohola = a;
			proizvajalec = p;
			stil = s;
	}
	
	// Konstruktor, ki ustvari pivsko steklenico
	// v kateri ni piva
	public PivskaSteklenica(int k, String p) {
		
			// pokličemo konstruktor nadrazreda
			super(k, p);
			
			// inicializiramo dodatne lastnosti
			temperatura = 0.0;
			stopnjaAlkohola = 0.0;
			proizvajalec = "";
			stil = "";
			
	}
	
	
	// javna metoda ogreje pivo za določeno število stopinj
	// vhod: niz s temperaturo
	// vrne: /
	// Meče izjemo v primeru napačnega vnosa
	public void ogrej(String tempS) throws Exception {
		
		// Skušamo pretvoriti niz v double
		double tempD = 0.0;
		
		try {
			tempD = Double.parseDouble(tempS);
		}
		
		// Če metoda parseDouble vrže izjemo
		catch(Exception e){
			
			// Izpišemo napako in vržemo izjemo naprej
			System.out.println("Napaka pri pretvorbi: "+ e.toString());
			throw new Exception(tempS + " ni število!");
		}
		System.out.print("Pivo ogrevam iz " + temperatura);
		
		// Če bi bila končna temperatura previsoka, vržemo izjemo
		if (temperatura+tempD >= 100.0) {
			temperatura = 100.00;
			throw new Exception("Pivo je zavrelo!");
		}
		
		// Če bi bila končna temperatura prenizka, vržemo izjemo
		if (temperatura+tempD <= 0.0) {
			temperatura = 0.0;
			throw new Exception("Pivo je zamrznilo!");
		}
		
		// Povečamo temperaturo piva 
		temperatura += tempD;
		
		System.out.println(" na " + temperatura+ " stopinj.");
	}
	public String getNalepka() {
		
		String ret = "=== PIVO ===\n";
		ret += "Vsebina: " +getKapaciteta()+ " ml\n";
		ret += "Proizvajalec: " +proizvajalec+ "\n";
		ret += "Stil: " +stil+ "\n";
		ret += "Alkohol: " + stopnjaAlkohola + " %\n";
		ret += "=========\n";
		return ret;
	}
	
		// getter metoda , ki vrne stopnjo alkohola
		public double getStopnjaAlkohola() {
			return stopnjaAlkohola;
		}
		
		// getter metoda , ki vrne proizvajalca
		public String getProizvajalec() {
			return proizvajalec;
		}
		
		// getter metoda , ki vrne stil
		public String getStil() {
			return stil;
		}
}