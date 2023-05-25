class Lab19 {
	public static void main(String args[]) {
		System.out.println("Vaibhav Upreti 029");
		Person p1 = new Person();
		p1.getDetails();	
	}
}
interface Mother {
	String hairColour = "Brown";
}
interface Father {
	String skinTone = "Light";
}
class Person implements Mother, Father {
	public void getDetails() {
		System.out.println("Hair Colour is: "+hairColour);
		System.out.println("Skin Tone is: "+skinTone);
	}
}

