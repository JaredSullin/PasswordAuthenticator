import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.security.SecureRandom;
import java.util.Scanner; 

public class Authenticator {
	
    static ArrayList<User> credentials = new ArrayList<User>();
	
	static User user;

	public static void main(String[] args) throws FileNotFoundException {
		
		String username = ""; 
		String password = ""; 
		String passwordHash = ""; 
		int salt = 0;
		
		// adds scanner
		
		Scanner keyboard = new Scanner(System.in);
		
		// create instance of Random class 
		
		Random RANDOM = new SecureRandom();
		
			// Generate random integers in range 0 to 9999
			
		salt = RANDOM.nextInt(10000);
		
			// prompt for username
			
		System.out.println("Username : ");
			
			// takes input for username 
			
		username = keyboard.nextLine();
			
			// prompt for password
			
		System.out.println("Password : ");
			
			// takes input for password
			
		password = keyboard.nextLine();
			
		password = password + salt;
			
			//converts password and salt to hash code and that number will be 
			//the username's password verifyer
			
		passwordHash =  "" + password.hashCode();
			
		if(passwordHash.contains("-")) {
			passwordHash = passwordHash.replace("-", "");
		}
			
		System.out.println(passwordHash);
			
		String saltstring = salt + "";
				
		User user = new User(username, saltstring, passwordHash);
			
		addUser(user);
			
		user.writer();
		
		keyboard.close();
		

	}
	
	User removeUser(User user) {
		
		
		for(User string : credentials) {
			if(credentials.contains(user)) {
				
				
				credentials.remove(user);
				
			}
		}
		
		return user;
		
	}
	
	 static int addUser(User user) {

			credentials.add(user);
			
			return 0;
		
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
			
			//if (credentials.contains(o))
			
			userIDnumb++;
			
			
		}while (userValid == false);
		
		
		return userValid;
	}
	
	int LoadUsers(String credentialsPath) {
		return 0;
		
	}

}
