package Homework3.Exercise1.Accounts;

public class AccountManager {

    public void test3(){
        Account account = new Account();
        account.owner = "Mr. A"; //Zugriff möglich da public
        //account.balance = 233.12; //Zugriff nicht möglich, da balance private ist.
        // Eine package class kann auf alle Methoden und Attribute zugreifen außer auf welche die private sind
        account.pin = 6768;  //Zugriff möglich da protected
        account.internalNote ="Aaa"; //Zugriff möglich da nur package private


        account.getBalance(); //Funktioniert da public
        account.changePin(273482,668819);

        // Aufruf möglich, weil changePin() public ist.
        // Die Methode kann auf this.pin zugreifen, weil sie sich in der Klasse Account befindet.

    }
}
