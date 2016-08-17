/** Name:  Younggil Lee
 * Assignment:  Assignment2
 * Program: Computer Programmer
 * 
 * Making banking program 
 */

package YounggilLeeAssignment2;

/**
 * The SavingAccount is subclass of Account. Also have subclass is investment
 * account.
 */
public class SavingsAccount extends Account {

	/** The error message. */
	protected String errorMsg;

	/** The rate. */
	protected double rate;

	/** The deposit. */
	protected double deposit;

	/** The withdraw. */
	protected double withdraw;

	/** The template value to choose print status . */
	protected double temp;

	/**
	 * Instantiates a new savings account.
	 *
	 * @param rate
	 *            the rate
	 */
	public SavingsAccount(double rate) {
		super(102);
		chgRate(rate);
	}

	/**
	 * Transaction method to check withdraw that is proper or not.
	 *
	 * @param withdraw
	 *            form the suer
	 */
	@Override
	public void transaction(double withdraw) {

		if (withdraw > this.getBalance()) {
			errorMsg = "Overdraft excedeed.Transaction canceled";
			this.withdraw = 0;
			double withBalance1 = getBalance() + this.rate;
			setBalance(withBalance1);
			this.temp = 1;

		} else {

			double withBalance2 = (getBalance() - withdraw) + this.rate;
			setBalance(withBalance2);
			this.temp = 2;

		}

	}

	/**
	 * Calculate balance.
	 *
	 * @param deposit
	 *            from the user
	 * @param withdraw
	 *            from the user
	 */
	@Override
	public void calBalance(double deposit, double withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;
		transaction(withdraw);

		double addBalance = getBalance() + deposit;
		setBalance(addBalance);

	}

	/**
	 * Change rate to each account.
	 *
	 * @param annulrate
	 */
	@Override
	public void chgRate(double rate) {
		// TODO Auto-generated method stub
		this.rate = rate * getBalance();
	}

	/**
	 * print information of savingAccount
	 * 
	 * @see print
	 */
	@Override
	public String toString() {
		if (temp == 1) {
			return getAccountNum() + "	" + this.deposit + "	    "
					+ this.withdraw + "	         " + this.rate + "    "
					+ this.getBalance() + "\n" + this.errorMsg;
		} else {
			return getAccountNum() + "	" + this.deposit + "	    "
					+ this.withdraw + "	 " + this.rate + "    "
					+ this.getBalance() + "\n";
		}
	}

}
