/** Name:  Younggil Lee
 * Assignment:  Assignment2
 * Program: Computer Programmer
 * 
 * Making banking program 
 */

package YounggilLeeAssignment2;

/**
 * The ChequingAccount is subclass of Account. Also use Overdraftable interface
 * class
 */
public class ChequingAccount extends Account implements Overdraftable {

	/** The error message. */
	private String errorMsg;

	/** The rate. */
	private double rate;

	/** The deposit. */
	private double deposit;

	/** The withdraw. */
	private double withdraw;

	/** The temp. */
	private double temp;

	/**
	 * Instantiates a new ChequingAccount. customer name and balance is used by
	 * Account values.
	 * 
	 * @param rate
	 *            is annual rate
	 */
	public ChequingAccount(double rate) {
		super(101);
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
		// TODO Auto-generated method stub
		double chkwithdraw = getBalance() - withdraw;

		if (chkwithdraw < overdraft()) {
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
		// TODO Auto-generated method stub
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
	 * print information of chequingAccount
	 * 
	 * @see form of printing table
	 */
	@Override
	public String toString() {

		if (temp == 1) {
			
				return String.format("%s%s%n%d     %.2f      %.2f          %.2f"
						+ "      %.2f%n", super.toString(),this.errorMsg,getAccountNum(),this.deposit
						,this.withdraw,this.rate, this.getBalance());
			
			
			
			/*return super.toString() + getAccountNum() + "	" + this.deposit
					+ "	    " + this.withdraw + "	         " + this.rate
					+ "    " + this.getBalance() + "\n" + this.errorMsg;*/
		} else {
			return super.toString() + getAccountNum() + "	" + this.deposit
					+ "	    " + this.withdraw + "	 " + this.rate + "    "
					+ this.getBalance() + "\n";
		}
	}

	/**
	 * the method from interface class in overdraftable
	 * 
	 * @see to set limit of overdraft
	 */
	@Override
	public double overdraft() {
		// TODO Auto-generated method stub
		double limit = -500;
		return limit;
	}

}
