package Week3.day3;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatApp()
	{
		System.out.println("Your Whatsapp is connected");
	}

	public static void main(String[] args) {
		
		SmartPhone mob2=new SmartPhone();
		mob2.connectWhatApp();
		mob2.takeVideo();
		mob2.sendMsg();
		mob2.makeCall();
		mob2.saveContact();
		
		

	}

}
