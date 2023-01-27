package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	/*we need a constructor to receive
	 * first name and last name 
	 */
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + this.lastName);
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		//Combine elements to set email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" 
		+ department + "." + companySuffix;
		System.out.println("Your email is: " + email);
		
		
		
		
		
	}
	/*
	 * Ask for a department*/
	private String setDepartment() {
		System.out.print("Hi New Worker: " + firstName+ " Welcome to the company\n"
				+ "Let me give you your email and password!!!\n"
				+ " Please write it down\n But first please "
				+ "select from the following Department codes\n"
				+ "DEPARTMENT CODES\n1 for Sales\n2 for Development\n3"
				+ " for Accounting\n0 for none\nEnter department code:");
		Scanner type = new Scanner(System.in);
		int depChoice = type.nextInt();
		if (depChoice ==1) { return "sales";}
		else if (depChoice ==2) {return "dev";}
		else if (depChoice ==3) { return "acct";}
		else { return "";}
		
		}
	
	
		

	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@£$%^&*";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
		
	}
	

	 // Set the mailbox capacity, want it to be a public API
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
		
     //Set the alternate email
	public void setAltEmail(String altemail) {
	this.alternateEmail = altemail;
	}
	
	 //Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String showinfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n "
				+ "COMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	public int getmailboxCapacity(){ return mailboxCapacity;}
	public String getalternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	
		
	 
	
	
}

