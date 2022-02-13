
public class Address extends InputReader{

	private String rruga;
	private int pallati;
	private String qyteti;
	
	public Address(String rruga,int pallati,String qyteti) {
		this.rruga = rruga;
		this.pallati = pallati;
		this.qyteti = qyteti;	
	}

	public String getRruga() {
		return rruga;
	}

	public String setRruga(String rruga) {
		this.rruga = rruga;
		return rruga;
	}

	public int getPallati() {
		return pallati;
	}

	public int setPallati(int pallati) {
		this.pallati = pallati;
		return pallati;
	}

	public String getQyteti() {
		return qyteti;
	}

	public String setQyteti(String qyteti) {
		this.qyteti = qyteti;
		return qyteti;
	}

	@Override
	public String toString() {
		return "Address [rruga=" + rruga + ", pallati=" + pallati + ", qyteti=" + qyteti + "]";
	}
}
