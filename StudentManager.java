package ucuncuhaftaodevv;

public class StudentManager extends UserManager{

	public void loginStudent(Student student) {
		System.out.println(student.getName()+" "+student.getLastname()+" adl� ��renci giri� yapt�.");
		}
	
	public void commentAdd(Student student) {
		System.out.println(student.getName()+" "+student.getLastname()+" adl� ��renci yorum ekledi.");
		}
}
