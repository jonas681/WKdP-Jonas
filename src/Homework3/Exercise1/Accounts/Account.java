package Homework3.Exercise1.Accounts;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    /*public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }*/

    public double getBalance() {
        return balance;
    }
    public String changePin(int oldPin, int newPin) {
        if(this.pin == oldPin){
            this.pin = newPin;
            return "Your Pin has been successfully changed";
        }else return "False Pin, please Try again!";
    }
}
