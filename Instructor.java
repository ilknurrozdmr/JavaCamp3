package ucuncuhaftaodevv;

public class Instructor extends User{

	private String department;

	public Instructor(int id, String name, String lastname, String email, String password, String department) {
		super(id, name, lastname, email, password);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	

	
	

	
}
