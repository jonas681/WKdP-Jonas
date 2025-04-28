package Homework3.Exercise1.ExternalAndCompany;

import Homework3.Exercise1.Accounts.Account;

public class ExternalAudit {

    public void test2(){
        Account account = new Account();
        account.owner = "Mr. A"; //Zugriff möglich da public
        //account.balance = 233.12;
        //account.pin = 6768;
        //account.internalNote = Aaa;

        //Zugriff nicht möglich da ExternalAudit eine fremde Klasse ist.
        // Kann nur bei dem Sicherbarkeitmodifaktor public auf Attribute oder Methoden zugreifen

        account.getBalance(); //Funktioniert da public
        account.changePin(273482,668819);
        // Aufruf möglich, weil changePin() public ist.
        //Der Zugriff auf this.pin innerhalb der Methode changePin() ist kein Problem,
        //weil dieser Zugriff intern in der Klasse Account selbst passiert!


    }
}
