package lspviolation;

public class MyAccount {
    String name="abc";
    String accNo="2020abc";
    void getAccountDetails() {
        System.out.println("bank account details:name " + name);
        System.out.println("bank account details:accno " + accNo);
    }
}

class  LspViolates{
    public static void main(String[] args) {
        Salaried s = new Salaried();
        s.getSalaryDetails();
        Savings ss = new Savings();
        ss.savingsDisplay();
        Transaction ssa = new Transaction();
        ssa.transactionHistory();

    }
}

