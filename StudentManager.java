package ucuncuhaftaodevv;

public class StudentManager extends UserManager{

	public void loginStudent(Student student) {
		System.out.println(student.getName()+" "+student.getLastname()+" adlı öğrenci giriş yaptı.");
		}
	
	public void commentAdd(Student student) {
		System.out.println(student.getName()+" "+student.getLastname()+" adlı öğrenci yorum ekledi.");
		}
}
