import java.util.Date;

public class Participant  {
	
	private String name;
	private static int id=1;
	private int age;
	private String sex;
	private Batch batch;
	private String email;
	private String address;
	
	
	
	public Participant(String name, int age, String sex, Batch batch, String email, String address) {
		this.id=+id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.batch = batch;
		this.email = email;
		this.address = address;
	}
	
	
	
	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Participant.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Participant [name=" + name + ", age=" + age + ", sex=" + sex + ", batch=" + batch + ", email=" + email
				+ ", address=" + address + "]";
	}



	



	


	
	
	


}
