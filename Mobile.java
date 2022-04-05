package Week3.day3;

public class Mobile {
	public void sendMsg()
	{
		System.out.println("Good Morning");
	}
	public void makeCall()
	{
		System.out.println("Please attend the call");
	}
	public void saveContact()
	{
		System.out.println("Your Contacts are Saved Succesfully");
	}

	public static void main(String[] args) {
		Mobile mob1=new Mobile();
		mob1.sendMsg();
		mob1.makeCall();
		mob1.saveContact();
	}

}
