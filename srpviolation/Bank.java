package srpviolation;

public class Bank {
       System.out.println("enter acnt no:" + accno);
            System.out.println("enter name:" + name);

    public void transaction()
    {
        System.out.println("transaction details");
    }

    public static void main(String[] args)
    {
        Bank bank = new Bank();
        bank.transaction("2022abc", "abc");
    }
}
