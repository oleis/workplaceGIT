import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gjest extends Kort{

	private String navn;
	private int PIN = 9999;
	private int kortnummer;
	private Calendar kortOpprettet;
	private Calendar kortetsSperreDato;
	private Calendar realTime;
	
	
	public Gjest(String navn, int PIN){
		super(navn,PIN);
		this.navn = navn;
		this.PIN = PIN;
		this.kortnummer = getKortnummer();
		this.kortOpprettet = new GregorianCalendar();
		this.kortetsSperreDato = new GregorianCalendar();
		kortetsSperreDato.add(Calendar.DAY_OF_MONTH, 7);
		this.realTime = new GregorianCalendar();
		}
	
	@Override
	public boolean sjekkPIN(int PIN){
		if (getPIN() != PIN){
			return false;
		}
		else if(kortetsSperreDato.compareTo(realTime) < 0);
			
		return true;
		}
	
	}

