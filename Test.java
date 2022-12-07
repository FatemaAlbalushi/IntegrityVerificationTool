import java.util.Scanner; 

class Test{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Select an action: ");
		System.out.println("-------------------");
		System.out.println("1. Generate Hash");
		System.out.println("2. Compare Hash");
		System.out.println("3. Re-compute");	
		System.out.println("-------------------");
		 
		System.out.println("Your Action is: ");
		System.out.println("-------------------");
		int actionNum = input.nextInt(); 
		
		if (actionNum==1) {
			System.out.println("1. Generate Hash");
		}
		else if (actionNum==2) {
			System.out.println("2. Compare Hash");
		}
		else {
			System.out.println("3. Re-compute");
		}	
	}
}