package Homework4.Exercise1;

public class Milk extends PopularGrocery {

    public Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15;

    }

    @Override
    public int getBulkDiscount() {
        if(quantity >= discountThreshold){
            return 12;
        }else return 0;
    }

}
