/**
 * This class models a BankAccount
 * @author alanbatrez & pedroeperezn
 * @version 1.0
 */
class BankAccount
{
    private double balanceCAD;
    private final String accountNumber;
    private String memberLastName;


    /**
     * The constructor for BankAccount class
     * @param balance The balance of the bankAccount
     * @param accountNumber The number of the bankAccount
     * @param memberLastName The member Last Name of the BankAccount
     */
    BankAccount(  double balance,
                  String accountNumber,
                  String memberLastName)

    {
        this.balanceCAD =     balance;
        this.accountNumber =  accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * Gets current balance on account
     * @return balance on account
     */
    public double getAccountBalance()
    {
        return balanceCAD;
    }

    /**
     * Gets account number of account
     * @return account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * Get last name of the account's owner
     * @return member last name
     */
    public String getMemberLastName()
    {
        return memberLastName;
    }

    /**
     * Public method for the class bankAccount that is used to make withdraw
     * @param amount The amount with data type double
     * @return Returns the result of the operation between this.balance - amount
     */
    public void makeWithdraw(double amount)
    {
        this.balanceCAD = this.balanceCAD - amount;
    }

    /**
     * Public method for the class bankAccount that is used to make deposits
     * @param amount The amount with data type double
     * @return Returns the result of the operation between this.balance + amount
     */
    public void makeDeposit(double amount)
    {
        this.balanceCAD = this.balanceCAD + amount;
    }

    /**
     * Transfer funds from one account to another
     * @param amount amount of CAD to transfer
     * @param recipient bank account that will receive the transfer
     */
    public void makeTransfer(double amount, BankAccount recipient)
    {
        this.balanceCAD = this.balanceCAD - amount;
        recipient.makeDeposit(amount);
    }

}
