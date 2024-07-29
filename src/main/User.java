package main;

public class User {
	
	private int userID;
	private String userName, fName, lName;
	
	User(int userID) {
		this.userID = userID;
	}
	
	public int getUserID() {
		return userID;
	} 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

}
