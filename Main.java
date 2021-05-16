package ucuncuhaftaodevv;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor(1,"�lknur","�zdemir","io@gmail.com","123","Yaz�l�m");
		Instructor instructor2=new Instructor(2,"Mahmut","Da�l�","md@gmail.com","322","Tasar�m");
		
		Student student1=new Student(1,"Ay�e","Tun�","at@gmail.com","456","913");
		Student student2=new Student(1,"Ahmet","Uysal","au@gmail.com","312","1047");
        
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.loginInstructor(instructor1);
		instructorManager.addUser(instructor2);
		instructorManager.deleteUser(instructor1);
		instructorManager.addHomework(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.loginStudent(student1);
		studentManager.addUser(student2);
		studentManager.deleteUser(student1);
		studentManager.commentAdd(student2);
	}

}
