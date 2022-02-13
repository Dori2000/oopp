
public class Contact extends InputReader{
	private String email;
	private String cel;
	
	public Contact(String email,String cel) {
		this.email =email;
		this.cel = cel;
	}

	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getCel() {return cel;}
	public String setCel(String cel) {this.cel = cel;
		return cel;
	}
	
	@Override
	public String toString() {
		return "Contact [email=" + email + ", cel=" + cel + "]";
	}


}
