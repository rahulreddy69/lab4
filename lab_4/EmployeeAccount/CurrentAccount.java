package lab_4.EmployeeAccount;

public class CurrentAccount extends Account {

	public CurrentAccount(Person accholder, double balance) {
		super(accholder, balance);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean check(double amt)
	{
	 final int overdraft=2000;
		if(overdraft<amt)
			return false;
		else
			return true;
	}
	
	public void withdraw(double amt)
	{
		boolean b1 = check(amt);
		if(b1==false)
		{
			System.out.println("Withdraw not possible");
		}
		else
			super.balance=super.balance-amt;
	}

}