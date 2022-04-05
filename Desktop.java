package Week3.day3.ass4;

public class Desktop implements Hardware,Software {
	
	public void desktopModels()
	{
		System.out.println("Desktop Model number is 466321");
	}

	public static void main(String[] args) {
		
		Desktop des=new Desktop();
		des.desktopModels();
		des.softwareResources();
		des.HardwareResources();
		

	}

	

	

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("software");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware");
	}

	public void SoftwareResources() {
		// TODO Auto-generated method stub
		
	}

	public void HardwareResources() {
		// TODO Auto-generated method stub
		
	}

}
