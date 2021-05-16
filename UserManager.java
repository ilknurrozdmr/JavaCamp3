package ucuncuhaftaodevv;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getName()+" "+user.getLastname()+ " adlý kullanýcý kaydedildi.");
		
	}
    public void deleteUser(User user) {
    	System.out.println(user.getName()+" "+user.getLastname()+ " adlý kullanýcý silindi.");
		
	}
    

}
