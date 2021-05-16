package ucuncuhaftaodevv;

public class Student extends User{

	private String number;

	public Student(int id, String name, String lastname, String email, String password, String number) {
		super(id, name, lastname, email, password);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
}
