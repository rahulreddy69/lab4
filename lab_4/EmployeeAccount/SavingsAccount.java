package lab_4.EmployeeAccount;

public class SavingsAccount extends Account{

	public SavingsAccount(Person accholder, double balance) {
		super(accholder, balance);
		// TODO Auto-generated constructor stub
	}

	private final int minbalance = 500;
	
	public void withdraw(double amt)
	{
		if(super.balance<=minbalance )
		{
			System.out.println("Withdraw not Possible");
		}
		else
		{
			super.balance = balance-amt;
		}
			
	}
}