package Homework3.Exercise1.ExternalAndCompany;


import Homework3.Exercise1.Accounts.Account;

public class CompanyAccount extends Account {

public void test(){
    this.owner = "FirmaA"; //Zugriff möglich da public
    //this.balance = 22.3; //nicht möglich zuzugreifen da private
    this.pin = 32999;
    //Zugriff möglich da protected und CompanyAccount von Account erbt. Funktioniert trotz unterschiedlichen packages
    //this.internalNote = "abc"; //Zugriff nicht möglich, da internalNote package-private ist.
    // CompanyAccount erbt zwar von Account, ist aber nicht im selben Package, deswegen Zugriff nicht möglich
    getBalance();
    changePin(this.pin, 1669); //Zugriff möglich da public

}



}
