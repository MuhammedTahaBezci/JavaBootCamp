
public class Main {

	public static void main(String[] args) {
	
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "123456", "...@gmail.com", "1");
		
		Student student = new Student(2, "Taha", "Bezci", "123456", "...@gmail.com", "21001");
	
		InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        
      
        User[] users = new User[]{student,instructor};

		
	}

}

