package srp;

public class Transaction {
    public void transactionHistory() {
        System.out.println("accno-type: transaction details");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount("2022abc", "abc");
    }
}
