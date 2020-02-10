import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.security.SecureRandom;

public class Authenticator {
	
	static ArrayList<User> credentials = new ArrayList<User>();
	
	User user;

	public static void main(String[] args) {
		
		addUser(credentials);
	

	}
	
	static int addUser(ArrayList<User> array) {
		
		// create instance of Random class 
		
		Random RANDOM = new SecureRandom();
		
		// Generate random integers in range 0 to 999 
		
		int salt = RANDOM.nextInt(10000);
		
		System.out.println(salt);
		
		
        
        
      //  credentials
        
        
		
		
		return salt;
		
	}
	
	Boolean isUserValid(String username, String password) {
		
		
        
       
        
        int userIDnumb = 0;
        
		
		Boolean userValid = false;
		
		System.out.println("What is your Username and Password");
		
		do {

			System.out.println("Username : ");
			
			user.setUsername(username);
			
			System.out.println("Password : ");
			
			user.setPasswordHash(password);
			
			//if (credentials.co)
			
			userIDnumb++;
			
			
		}while (userValid == false);
		
		
		return userValid;
	}

}
