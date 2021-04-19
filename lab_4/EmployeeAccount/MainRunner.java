package lab_4.EmployeeAccount;

public class MainRunner {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Smith",25);
		Account a1 = new SavingsAccount(p1,2000);
		a1.setAccnum(1);
		System.out.println(a1.toString());
		a1.deposit(2000);
		System.out.println(a1.toString());
		a1.withdraw(2000);
		System.out.println(a1.toString());
		
		Person p2 = new Person("Kathy",30);
		Account a2 = new CurrentAccount(p2,3000);
		a2.setAccnum(2);
		System.out.println(a2.toString());
		a2.withdraw(4000);
		System.out.println(a2.toString());
		
		
	}

}