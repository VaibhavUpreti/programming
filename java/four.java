class Solution{
	public static void main(String args[]){
        System.out.println("Vaibhav Upreti");
		int min = 1;
		int max = 100;
		int flag = 0;
		int r = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println("Random Number: " + r);
		for (int i = 2; i < r; i++){
			if (r % i == 0){
				flag = 1;
				break;
			}
		}
		if (flag == 0){
			System.out.print(r + " is a Prime Number");
		}
		else{
			System.out.print(r + " is a Composite Number");
		}
	}
}

