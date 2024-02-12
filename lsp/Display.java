package lsp;

public class Display {
    public static void main(String[] args) {
        AccountDetails ad = new AccountDetails();
        ad.getAccountDetails();
        SalaryAccount sa1 = new SalaryAccount();
        sa1.getAccountDetails();
        SavingsAccount sa2 = new SavingsAccount();
        sa2.getAccountDetails();

    }
}
