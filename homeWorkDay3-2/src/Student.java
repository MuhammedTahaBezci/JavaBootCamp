
public class Student extends User {

		private String studentNumber;

		public Student(int id, String firstName, String lastName, String pasword, String email, String studentNumber) {
			super(id, firstName, lastName, pasword, email);
			this.studentNumber = studentNumber;
		}

		public String getStudentNumber() {
			return studentNumber;
		}

		
	
}
