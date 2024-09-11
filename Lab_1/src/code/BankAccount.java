/**
 * This class models a BankAccount
 * @author alanbatrez
 * @version 1.0
 */
class BankAccount
{
    private double balance;
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
        this.balance =        balance;
        this.accountNumber =  accountNumber;
        this.memberLastName = memberLastName;

    }

    /**
     * Public method for the class bankAccount that is used to make withdraw
     * @param amount The amount with data type double
     * @return Returns the result of the operation between this.balance - amount
     */
    public double makeWithdraw(double amount)
    {
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
        return this.balance = this.balance- amount;
    }

    /**
     * Public method for the class bankAccount that is used to make deposits
     * @param amount The amount with data type double
     * @return Returns the result of the operation between this.balance + amount
     */
    public double makeDeposit(double amount){
        System.out.println("Depositing " + amount + " from account " + accountNumber);
        return this.balance = this.balance + amount;
    }

}
