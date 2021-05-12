
public class InterfaceExample implements Demointerface,Demointerface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demointerface d= new InterfaceExample();
		Demointerface2 d2= new InterfaceExample();
		d.goGreen();
		d.redStop();
		d2.corona();
		d2.welcome();
		

		

	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to interface example");
		
	}

	@Override
	public void corona() {
		// TODO Auto-generated method stub
		System.out.println("Stay home and use mask");
		
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("Go when you see green");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop when you see red");
		
	}

}
