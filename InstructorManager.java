package ucuncuhaftaodevv;

public class InstructorManager extends UserManager{

	public void loginInstructor(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastname() +" adl� ��renci giri� yapt�.");
		}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastname() + " �dev ekledi.");
		}
}
