package Week3.day3;

public class AndroidPhone extends Mobile {
	
	public void takeVideo()
	{
		System.out.println("Your video clarity is good");
	}
	

	public static void main(String[] args) {
		AndroidPhone mob=new AndroidPhone();
		mob.takeVideo();
		mob.sendMsg();
		mob.makeCall();
		mob.saveContact();

	}

}
