import java.util.Date;

public class IdDoc extends InputReader {

	private String emri;
	private String mbiemri;
	private String dtl;
	private String vendlindja;
	private String gjinia;
	private String dataLeshimit;
	private String dataSkadimit;
	private int id;
	
	public IdDoc(String emri, String mbiemri, String dtl, String vendlindja, String gjinia, String dataLeshimit, String dataSkadimit, int id) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.dtl = dtl;
		this.vendlindja = vendlindja;
		this.gjinia = gjinia;
		this.dataLeshimit = dataLeshimit;
		this.dataSkadimit = dataSkadimit;
		this.id = id;
	}

	

	public String getEmri() {return emri;}
	public void setEmri(String emri) {this.emri = emri;}

	public String getMbiemri() {return mbiemri;}
	public void setMbiemri(String mbiemri) {this.mbiemri = mbiemri;}

	public String getDtl() {return dtl;}
	public void setDtl(String dtl) {this.dtl = dtl;}

	public String getVendlindja() { return vendlindja;}
	public void setVendlindja(String vendlindja) {this.vendlindja = vendlindja;}

	public String getGjinia() {return gjinia;}
	public void setGjinia(String gjinia) {this.gjinia = gjinia;}

	public String getDataLeshimit() {return dataLeshimit;}
	public void setDataLeshimit(String dataLeshimit) {this.dataLeshimit = dataLeshimit;}

	public String getDataSkadimit() {return dataSkadimit;}
	public void setDataSkadimit(String dataSkadimit) {this.dataSkadimit = dataSkadimit;}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	
	@Override
	public String toString() {
		return "IdDoc [emri=" + emri + ", mbiemri=" + mbiemri + ", dtl=" + dtl + ", vendlindja=" + vendlindja
				+ ", gjinia=" + gjinia + ", dataLeshimit=" + dataLeshimit + ", dataSkadimit=" + dataSkadimit + ", id="
				+ id + "]";
	}
}
