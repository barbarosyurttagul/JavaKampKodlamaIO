
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.firstName = "Ali";
		student1.lastName = "Veli";
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.InstructorBranch = "Fen Bilgisi";
		
		StudentManager manager = new StudentManager();
		manager.add(student1);
		
		InstructorManager iManager = new InstructorManager();
		iManager.add(instructor1);

	}

}
