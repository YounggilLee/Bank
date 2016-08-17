/** Name:  Younggil Lee
 * Assignment:  Assignment2
 * Program: Computer Programmer
 * 
 * Making banking program 
 */

package YounggilLeeAssignment2;

/**
 * The Abstract Class Account .
 */
public abstract class Account {

	/** The account number. */
	private int accountNum;

	/** The customer name. */
	private String customerName;

	/** The balance. */
	private double balance;

	/**
	 * Instantiates a new account.
	 *
	 * @param accountNum
	 *            the account number
	 */
	protected Account(int accountNum) {

		setCustomerName("Calros");
		setAccountNum(accountNum);
		setBalance(1000);

	}

	/**
	 * Gets the account number.
	 *
	 * @return the account number
	 */
	public int getAccountNum() {
		return accountNum;
	}

	/**
	 * Sets the account number.
	 *
	 * @param accountNum
	 *            the new account number
	 */
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	/**
	 * Gets the customer name.
	 *
	 * @return the customer name
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the customer name.
	 *
	 * @param customerName
	 *            the new customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance
	 *            the new balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Transaction method to check withdraw that is proper or not.
	 *
	 * @param withdraw
	 *            form the suer
	 */
	public abstract void transaction(double withdraw);

	/**
	 * Calculate balance.
	 *
	 * @param deposit
	 *            from the user
	 * @param withdraw
	 *            from the user
	 */
	public abstract void calBalance(double deposit, double withdraw);

	/**
	 * Change rate to each account.
	 *
	 * @param annulrate
	 */
	public abstract void chgRate(double rate);

	/**
	 * print table
	 * 
	 * @see form of printing table
	 */
	public String toString() {
		return "\nCustomer : " + customerName
				+ "\n========================================================"
				+ "\nAccNo.	Deposit	  Withdraw	 Intr.   NewBal\n"
				+ "========================================================\n";

	}

}
