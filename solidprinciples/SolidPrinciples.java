package solidprinciples;

import dsp.Shelf;
import dspviolation.DVD;
import lsp.AccountDetails;
import lspviolation.Salaried;
import ocp.Circle;
import ocpviolation.AreaCalculator;
import ocpviolation.Rectangle;
import srpviolation.Bank;

public class SolidPrinciples {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.transaction("2022abc", "abc");
        Rectangle objRec=new Rectangle();
        Rectangle objRec=new Rectangle();
        Circle objCir=new Circle();
        Salaried s = new Salaried();
        s.getSalaryDetails();
        AccountDetails ad=new AccountDetails();
        ad.getAccountDetails();
        DVD a = new DVD();
        a.seeReviews();
        Shelf s = new Shelf();
        s.customizeShelf();
    }
}
