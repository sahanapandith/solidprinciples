package lsp;

public class AccountDetails {
    public String name="abc";
    public String accountNumber="2022abc";
    void getAccountDetails(){
        System.out.println("bank account details:account name "+name);
        System.out.println("bank account details:accountNumber "+accountNumber);
    }
}
public class SalaryAccount extends AccountDetails{

    @Override
    void getAccountDetails() {
        System.out.println("this is salary account");
    }
}

