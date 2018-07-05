import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class BankAccount {
	public String name;
	private String accountNumber;
	private double checkAcct = 0;
	private double saveAcct = 0;
	public static int numOfAcccounts = 0;
	public static double totalAllMoney = 0;
	
    public BankAccount(String name){
    	this.name = name;
    	// In the constructor call the private method 
    	//  so that each user has a random ten digit account.
        this.accountNumber = this.generateAccountNumber();
        // In the constructor increment the account count.
        numOfAcccounts++;
    }
	
	
	public BankAccount(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		// 
		this.accountNumber = this.generateAccountNumber();
        numOfAcccounts++;
	}
	
// Create a private method that returns a random ten digit account number.
	private String generateAccountNumber() {
		//ArrayList<Integer> randAcct = new ArrayList<Integer>();
		String randAcct = "";
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			randAcct += rnd.nextInt(10);
		}
//		System.out.println("Random Gen Account: " + randAcct);
		return randAcct;
	}
	
	
	//----- Getter 
	public String getAccount() {
		return accountNumber;
	}
	
	// Create a getter method for the user's checking account balance.
	public double getChecking() {
		return checkAcct;
	}
	
	// Create a getter method for the user's checking account balance.
	public double getSavings() {
		return saveAcct;
	}
	
	// Create a method that will allow a user to deposit money into 
	// either the checking or saving, be sure to add to total amount stored
	public void addToChecking(double addAmount) {
		this.checkAcct += addAmount;
	}
	
	public void addToSavings(double addAmount) {
		this.saveAcct += addAmount;
	}
	
	public void withdrawChecking(double amount) {
		if(this.checkAcct > 0 ) {
			this.checkAcct -= amount;
		} else {
			System.out.println("Sorry " + this.name + ", Insufficent Funds");
		}
	}
	
	public void withdrawSavings(double amount) {
		if(this.saveAcct > 0 ) {
			this.saveAcct -= amount;
		} else {
			System.out.println("Sorry " + this.name + ", Insufficent Funds");
		}
	}
	
}
