import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Konstanter {
	private String navn;
	private int PIN;
	private int time;

	public int hvilkenTime() {
		Calendar tid = new GregorianCalendar();
		time = tid.get(Calendar.HOUR_OF_DAY);
		return time;
	}

	public Ansatt(String navn, int PIN) {
		super(navn,PIN);
		this.navn = navn;
		this.PIN = PIN;
		this.time = hvilkenTime();
	}

	@Override
	public boolean sjekkPIN(int PIN) {
		if (getPIN() != PIN){
			return false;
		}
		else if  (time <= 17 && time >= 7 && isSperret() == false) {
			return true;
		} 
		else if (getPIN() == PIN && isSperret() == false) {
			return true;
		} 
		else if (isSperret() == true) {
			return false;
		} 
		else {
			return false;
		}
	}

	@Override
	public void settFornavn(String fornavn) {
		String[] splittetNavn = getNavn().split(" ");
		splittetNavn[0] = fornavn;
		setNavn(splittetNavn[0].concat(splittetNavn[1]));
		
	}


	@Override
	public String hentFornavn() {
		String[] splittetNavn = getNavn().split(" ");
		String forNavn = splittetNavn[0];
		return forNavn;
	}


	@Override
	public void settEtternavn(String etternavn) {
		String[] splittetNavn = getNavn().split(" ");
		splittetNavn[0] = etternavn;
		setNavn(splittetNavn[0].concat(splittetNavn[1]));
		
	}


	@Override
	public String hentEtternavn() {
		String[] splittetNavn = getNavn().split(" ");
		String etterNavn = splittetNavn[1];
		return etterNavn;
	}


	@Override
	public void settFulltnavn(String FulltNavn) {
		setNavn(FulltNavn);
		
	}


	@Override
	public String hentFulltnavn() {
		return getNavn();
	}


	@Override
	public double beregnKreditt() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double beregnBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
}
