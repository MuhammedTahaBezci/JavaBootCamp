

public class UserManager {

	public void add (User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " kullan�c� eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c� g�ncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kulan�c� eklendi");
	}
	public void user(User[] users){
	    for (User user : users){
	         add(user);
	    }
	}
}

