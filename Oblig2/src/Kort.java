
public abstract class Kort {
	
	private String navn;
	private int PIN;
	private int kortnummer;
	public static boolean sperretKort;
	
	
	public Kort(){
		
	}
	public Kort(String navn, int PIN){
		this.navn = navn;
		this.PIN = PIN;
		this.kortnummer = (int)(Math.random()*10000);
		sperretKort = false;
	}
	public String getNavn(){
		return navn;
	}
	private static boolean isSperret() {
		return sperretKort;
	}
	
	@Override
	public String toString() {
		return "Navn:  " + navn + "\nPinkode er: " + PIN + "\n Kortnummer er: " + kortnummer + "\n Kortet er "+(Kort.isSperret() ?"sperret" :"åpent");
	}
	

	public abstract boolean sjekkPin(int PIN);

	
}


