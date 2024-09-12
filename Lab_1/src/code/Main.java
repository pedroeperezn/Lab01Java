public class Main{
    public static void main(String[] args){

        // Initialize both bank accounts
        BankAccount b1 = new BankAccount(100.00,"abc123","gates");
        BankAccount b2 = new BankAccount(500.00,"xyz789","woods");

        // Operate on b1
        System.out.println(b1.getAccountBalance());
        b1.makeWithdraw(5.00);
        System.out.println(b1.getAccountNumber());
        System.out.println(b1.getAccountBalance());

        System.out.println("======================");

        // Operate on b2
        System.out.println(b2.getAccountBalance());
        b2.makeDeposit(23.00);
        System.out.println(b2.getMemberLastName());
        System.out.println(b2.getAccountBalance());

        System.out.println("======================");

        // Make transfer and print final balances
        b1.makeTransfer(50.00, b2);
        System.out.println(b1.getAccountBalance());
        System.out.println(b2.getAccountBalance());
    }
}
