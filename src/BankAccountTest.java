
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount introAcct = new BankAccount("Bill");
		
		System.out.println("Name: " + introAcct.name + ", Account Num: " + introAcct.getAccount());
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getChecking());
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getSavings());
		
		introAcct.addToChecking(500);
		introAcct.addToSavings(500);
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getChecking());
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getSavings());
		
		introAcct.withdrawChecking(75);
		introAcct.withdrawSavings(225);
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getChecking());
		System.out.println("Name: " + introAcct.name + ", Checking Amount: " + introAcct.getSavings());
		
		BankAccount meh = new BankAccount("Meh");
		meh.withdrawChecking(50);
		
	}
}
