


public class User{
	 private int userID;
	 private String username;
	 private String salt;
	 private String passwordHash;
	 
	 User(String name, String salt, String password){
		 
		 setUsername(name) ;
		 setSalt(salt);
		 setPasswordHash(password);
		 
		 
	 }
	 
	 public String getUsername() {
		 return username;
	 }
	 
	 public void setUsername(String newUsername) {
		 
		 this.username = newUsername;
	 }
	 
	 public String getSalt() {
		 
		 return salt;
	 }
	 
	 public void setSalt(String newSalt) {
		 this.salt = newSalt;
	 }
	 /**
	 * @return the PasswordHash
	 */
	 public String getPasswordHash() {
		 
		 return passwordHash;
	 }
	 /**
	  * @param newSalt the newSalt to set
	  */
	 public void setPasswordHash(String newSalt) {
		 this.passwordHash = newSalt;
	 }
	 /**
	 * @return the userID
	 */
	 public int getUserID() {
		return userID;
	 }

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	 public Boolean addUser() {
		 
		 
		return null;
	 }

	
	 
	
	
	
	
}


