/** Name:  Younggil Lee
 * Assignment:  Assignment2
 * Program: Computer Programmer
 * 
 * Making banking program 
 */

package YounggilLeeAssignment2;

/**
 * The Class InvestmentAccount is subclass of SavingAccount.
 */
public class InvestmentAccount extends SavingsAccount {

	/**
	 * Instantiates a new investment account.
	 *
	 * @param rate
	 *            the annual rate
	 */
	public InvestmentAccount(double rate) {
		super(rate);

	}

	/**
	 * Calculate balance using transaction method come from saving account
	 * 
	 * @param deposit
	 *            from the user
	 * @param withdraw
	 *            from the user
	 */
	@Override
	public void calBalance(double deposit, double withdraw) {
		double addMore = deposit / 2;
		this.deposit = deposit + addMore;
		this.withdraw = withdraw;

		transaction(withdraw);

		double addBalance = getBalance() + deposit + addMore;
		setBalance(addBalance);

	}

	/**
	 * print information of investmentAccount
	 * 
	 * @see print
	 */
	@Override
	public String toString() {
		return super.toString()+ 
				"\n========================================================";

	}
}
