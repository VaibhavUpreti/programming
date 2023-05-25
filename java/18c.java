class Lab18 {
	public static void main(String args[]) {
		Fake faked = new Fake();
		faked.copyright();		
	}
}
final class Original {
	void copyright() {
		System.out.println("Copyright Vaibhav 2023");
	}	
}
class Fake extends Original {
	void copyright() {
		System.out.println("Copyright Alex 2023");
	}	
}

