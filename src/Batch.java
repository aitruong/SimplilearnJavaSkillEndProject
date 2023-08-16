import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Batch implements ZumbaParticipant {
	
	private String batchName;
	private String startDate;
	private String endDate;
	
	private List<Participant> participants;
	

	

	public Batch(String batchName,String startDate, String endDate) {
		this.batchName=batchName;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public Batch(String batchName,List<Participant> participants ,String startDate, String endDate) {
		
		this.batchName = batchName;
		this.participants=participants;
		this.startDate = startDate;
		this.endDate = endDate;
		this.participants = participants;
	}



	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

	public List getParticipants() {
		return participants;
	}

	public void addParticipant(Participant p) {
		participants.add(p);
	}


	public int getNumberOfParticipants() {
		return participants.size();
	}


	
	@Override
	public void notifyUsers(Participant p, String messages, String currentDate)
	{
//		participants= new ArrayList<Participant>();
		SimpleDateFormat f= new SimpleDateFormat("MM/dd/yyyy");
		currentDate= f.format(new Date());
		System.out.println("Current date in String " + currentDate);
		
	
			
			
			if(p!=null && p.getBatch().startDate.equals(currentDate))
			{
				System.out.println("Hello "+ p.getName()+", "+ messages+"." +" Please join us now!");
			}else {
				System.out.println("Error");
			}
		
		
	
	}




	
	
	
}
