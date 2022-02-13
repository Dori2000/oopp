import java.util.Date;

public class Experience extends InputReader{
	
	private int experienceCounter;
	private String jobPosition;
	private String jobDescription;
	private Date startDate;
	private Date endDate;
	
	public Experience(int experienceCounter, String jobPosition,String jobDescription,Date startDate, Date endDate) {
		this.experienceCounter = experienceCounter;
		this.jobPosition = jobPosition;
		this.jobDescription = jobDescription;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	
	public int getExperienceCounter() {
		return experienceCounter;
	}


	public void setExperienceCounter(int experienceCounter) {
		this.experienceCounter = experienceCounter;
	}


	public String getJobPosition() {
		return jobPosition;
	}


	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}


	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	@Override
	public String toString() {
		return "Experience [experienceCounter=" + experienceCounter + ", jobPosition=" + jobPosition
				+ ", jobDescription=" + jobDescription + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
