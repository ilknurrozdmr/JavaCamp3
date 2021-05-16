package ucuncuhaftaodevv;

public class InstructorManager extends UserManager{

	public void loginInstructor(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastname() +" adlý öðrenci giriþ yaptý.");
		}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastname() + " ödev ekledi.");
		}
}
