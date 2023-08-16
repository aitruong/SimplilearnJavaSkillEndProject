import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ZumbaAppTester {

	public static void main(String[] args) {
		
		List<Participant> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name= sc.nextLine();
		System.out.println("What is your age?");
		int age= sc.nextInt();
		System.out.println("What is your sex?");
		String sex= sc.nextLine();
		System.out.println("What is your email?");
		String email= sc.nextLine();
		System.out.println("What is your address?");
		String address= sc.nextLine();
		System.out.println("What is your batch's name?");
		String batchName= sc.nextLine();
		System.out.println("What is your start date?");
		String startDate= sc.nextLine();
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/M/yyyy");
//		Date dateStart = null;
//		try {
//			
//			dateStart = sdf1.parse(startDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		System.out.println("What is your end date?");
		String endDate= sc.nextLine();
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/M/yyyy");
//		Date dateEnd = null;
//		try {
//			dateEnd = sdf2.parse(endDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		Batch batch1 = new Batch(batchName,startDate,endDate);
	
		Participant p1= new Participant( name,  age,  sex,  batch1,  email,  address);
		Participant p2= new Participant( "Tester", 34,  "F",  batch1,  "abc.yahoo.com",  "Tester");
		
		System.out.println("Participant 1 created: "+ p1.toString());
		list.add(p1);
		list.add(p2);
		System.out.println("List of participants: " + list);
		for(Participant p:list) {
		batch1.notifyUsers(p,"Your batch has started!",startDate);
		
		}
		
		System.out.println("Number of Participants: " + list.size());
		

	}

}
