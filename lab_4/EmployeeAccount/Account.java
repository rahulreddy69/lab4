package lab_4.EmployeeAccount;

public class Account {
	 long accnum;
	 double balance;
	 Person accholder;
	public Account(Person accholder, double balance ) {
		super();
		this.accholder = accholder;
		this.balance = balance;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public void deposit(double amt)
	{
		balance=balance+amt;
	}
	public void withdraw(double amt)
	{
		balance=balance-amt;
	}
	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance + ", accholder=" + accholder.getName() + "]";
	}

}