package Homework4.Exercise1;

public abstract class Article {
    protected int discountThreshold; //Schwellenwert für Rabatt
    protected int householdLimit;

//Konstruktur für abstrakte Klasse ist möglich zu implimentieren


    public abstract int getBulkDiscount();


    public abstract boolean showWarning();

}
