public class User {
		
		private int id;
		private String firstName;
		private String lastName;
		private String pasword;
		private String email;
		
		public User(int id, String firstName, String lastName, String pasword, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.pasword = pasword;
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPasword() {
			return pasword;
		}

		public void setPasword(String pasword) {
			this.pasword = pasword;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

}

