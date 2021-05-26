
public class Instructor extends User {

	private String instructorNumber;

	public Instructor(int id, String firstName, String lastName, String pasword, String email,
			String instructorNumber) {
		super(id, firstName, lastName, pasword, email);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}
}