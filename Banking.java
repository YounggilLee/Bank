/** Name:  Younggil Lee
 * Assignment:  Assignment2
 * Program: Computer Programmer
 * 
 * Making banking program 
 */

package YounggilLeeAssignment2;

import java.util.Scanner;


/**
 * The Class is main class of this package.
 */
public class Banking {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		
		ChequingAccount c = new ChequingAccount(.01);
		
		SavingsAccount s = new SavingsAccount(.02);
		
		InvestmentAccount i = new InvestmentAccount(.03);
		
		
		System.out.print("Enter amount you want to deposit:");
		double deposit = in.nextDouble();
		System.out.print("Enter amount you want to withdraw:");
		double withdraw = in.nextDouble();
		
		c.calBalance(deposit, withdraw);
		s.calBalance(deposit, withdraw);
		i.calBalance(deposit, withdraw);

		print(c);
		print(s);
		print(i);

	}
	
	/**
	 * Prints the toSing in ChequingAccount.
	 *
	 * @param c the ChequingAccount
	 */
	public static void print(ChequingAccount c) {
		System.out.println(c.toString() + "\n");
	}

	/**
	 * Prints the toString in SavingsAccount
	 *
	 * @param s the SavingsAccount
	 */
	public static void print(SavingsAccount s) {
		System.out.println(s.toString() + "\n");
	}

	/**
	 * Prints the toString
	 *
	 * @param i the InvestmentAccount
	 */
	public static void print(InvestmentAccount i) {
		System.out.println(i.toString() + "\n");
	}
	
	
	
}
