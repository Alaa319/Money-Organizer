import java.util.Scanner; 

public class MoneyOrganizer {

	public static void main(String[] args) {
		
		Scanner myScan; 
		myScan = new Scanner(System.in); 
		
		float amount; 
		
		int hundred;  
		int fifty;
		int twenty; 
		int ten; 
		int five; 
		int one; 
		int quarter; 
		int dime; 
		int nickel; 
		int cent; 
		
		//asking user for input
		System.out.print("Enter your dollar amount: "); 
		//saving the users input in the variable 'amount'
		amount = myScan.nextFloat();
			
		//creating calculations to count the amount the user input
		hundred = (int)amount / 100; 
		amount -= (hundred * 100);
		
		fifty = (int)amount / 50; 
		amount -= (fifty * 50); 
		
		twenty = (int)amount / 20; 
		amount -= (twenty * 20); 
		
		ten = (int)amount / 10; 
		amount -= (ten * 10);
		
		ten = (int)amount / 10; 
		amount -= (ten * 10);
		
		five = (int)amount / 5; 
		amount -= (five * 5);
		
		one = (int)amount / 1; 
		amount -= (one * 1);
		
		cent = (int)((amount / 0.01) + 0.01); 
		
		quarter = cent / 25; 
		cent %= 25; 
		
		dime = cent / 10; 
		cent %= 10;
		
		nickel = cent / 5; 
		cent %= 5;
		
		//printing a new line 
		System.out.print("\n"); 
		
		//printing a statement and new line
		System.out.print("You have:\n"); 
		System.out.print("\n"); 
		
		//printing the results of each section 
		System.out.println("-\t" + hundred + " hundred(s)\n"); 
		System.out.println("-\t" + fifty + " fifty(s)\n"); 
		System.out.println("-\t" + twenty + " twenty(s)\n"); 
		System.out.println("-\t" + ten + " ten(s)\n"); 
		System.out.println("-\t" + five + " five(s)\n");
		System.out.println("-\t" + one + " one(s)\n"); 
		System.out.println("-\t" + quarter + " quarter(s)\n"); 
		System.out.println("-\t" + dime + " dime(s)\n"); 
		System.out.println("-\t" + nickel + " nickel(s)\n");
		System.out.println("-\t" + cent + " cent(s)\n"); 
		
		//printing goodbye 
		System.out.print("Goodbye!\n"); 

	}

}
