
public class Education extends InputReader{

	private String arsimimi;
	private String fusha;
	private double notaMesatare;
	
	public Education(String arsimimi,String fusha,double notaMesatare) {
		this.arsimimi = arsimimi;
		this.fusha = fusha;
		this.notaMesatare = notaMesatare;
	}


	@Override
	public String toString() {
		return "Education [arsimimi=" + arsimimi + ", fusha=" + fusha + ", notaMesatare=" + notaMesatare + "]";
	}

	public String getArsimimi() {
		return arsimimi;
	}

	public String setArsimimi(String arsimimi) {
		this.arsimimi = arsimimi;
        return arsimimi;
    }

	public String getFusha() {
		return fusha;
	}

	public String setFusha(String fusha) {
		this.fusha = fusha;
		return fusha;
	}

	public double getNotaMesatare() {
		return notaMesatare;
	}

	public double setNotaMesatare(double notaMesatare) {
		this.notaMesatare = notaMesatare;
		return notaMesatare;
	}
}
