package bankaccount;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(double balance,String accountNumber) {
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	public double deposit(double amount) {
		balance+=amount;
		return amount ;
	}
	public void  withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			
		}
		else {
			System.out.println("Insufficient balance,so you would not withdaw money");
		
		}
	}	
	public double getBalance() {
		return balance;
	}
	
}
class SavingAccount extends BankAccount{

	public SavingAccount(double balance, String accountNumber) {
		super(balance, accountNumber);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
		if(getBalance()-amount<100) {
			System.out.println("you can not withdaral money!!!");
			
		}
		
		else {
			super.withdraw(amount);
		}
	}
}

package bankaccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BA123=new BankAccount(500.0,"BA123");
		System.out.println("------------------account created successfully------------------");
		System.out.println(" After depositing "+BA123.deposit(100)+"taka "+" new balance of your account:"+BA123.getBalance()+"taka");
		
		BA123.withdraw(400);
		System.out.println("After withdraw ,the new balance of your account :"+BA123.getBalance()+"taka");
	    
		
		SavingAccount SA100=new SavingAccount(600,"SA100");
		System.out.println("savings account is created successfully");
		SavingAccount SA200=new SavingAccount(700,"SA200");
		System.out.println("savings account is created successfully");
		
		
		System.out.println("After depositing "+SA100.deposit(100)+"taka "+"the new balance of your account "+SA100.getBalance()+"taka");
		SA100.withdraw(400.0);
		System.out.println("After withdraw,the new balance of your account is "+SA100.getBalance()+"TAKA");

		System.out.println("After depositing "+SA200.deposit(200)+"taka "+"the new balance of your account "+SA200.getBalance()+"taka");
		SA200.withdraw(300.0);
		System.out.println("After withdaw , the new balance of your account is "+SA200.getBalance()+"TAKA");
		
	}

}








