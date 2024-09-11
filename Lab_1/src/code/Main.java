public class Main{
    public static void main(String[] args){

        BankAccount b1 = new BankAccount(100.00,"1234","Riveros");
        System.out.println(b1.makeDeposit(50));
        System.out.println(b1.makeWithdraw(25));
    }
}
