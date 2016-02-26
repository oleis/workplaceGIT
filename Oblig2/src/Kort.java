
public abstract class Kort {
	
	private String navn;
	private int PIN;
	private int kortnummer;
	public static boolean sperretKort;
	
	
	public Kort(String navn, int PIN){
		this.navn = navn;
		this.PIN = PIN;
		this.kortnummer = (int)(Math.random()*10000);
		this.sperretKort = false;
	}
	public String getNavn(){
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public static boolean isSperret() {
		return sperretKort;
	}
	protected int getKortnummer(){
		return kortnummer;
	}
	public int getPIN(){
		return PIN;
	}
	@Override
	public String toString() {
		return "Navn:  " + navn + "\nPinkode er: " + PIN + "\nKortnummer er: " + kortnummer + "\nKortet er :"+( Kort.isSperret() ?"sperret" :"åpent");
	}
	

	public abstract boolean sjekkPIN(int PIN);

	@Override
	public Object clone(){
			try {
				return super.clone();
			} 
			catch (CloneNotSupportedException e) {
				return "Ingen kloning er tillatt";
			}
	}
	public int compareTo(Kort k){
		String[] x = navn.split(" ");
		String[] y = k.navn.split(" ");
		int LastName = x[x.length -1].compareTo(y[y.length-1]);
		int FirstName = x[0].compareTo(y[0]);
		if(LastName != 0 || FirstName != 0){
			return LastName + FirstName;
		}
		else{
			return 0;
		}	  		 

	}
	
	
	
}


