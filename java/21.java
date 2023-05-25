class Lab21 {
 private static String name = "Mr Meow";
   public static class Validator {
      public void testMethod() {
         System.out.println("This is a message from nested static class to " + name);
      }
   }
	public static void main(String args[]) {
		System.out.println(" Vaibhav Upreti 029 ");		
      	      Lab21.Validator nested = new Validator();
      	     nested.testMethod();
   	}
}

