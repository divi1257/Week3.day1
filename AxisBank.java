package Week3.day3.Assing1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("To deposit");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.deposit();
		bank.fixed();
		

	}

}
