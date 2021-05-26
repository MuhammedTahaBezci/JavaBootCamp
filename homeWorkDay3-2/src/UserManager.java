

public class UserManager {

	public void add (User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " kullanýcý eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcý güncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kulanýcý eklendi");
	}
	public void user(User[] users){
	    for (User user : users){
	         add(user);
	    }
	}
}

