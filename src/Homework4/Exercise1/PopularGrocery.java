package Homework4.Exercise1;

public abstract class PopularGrocery extends GroceryItem {
    protected int popularityLevel;
    protected int quantity;
    public PopularGrocery(int popularityLevel) {
        isPopular = true;
        this.popularityLevel = popularityLevel;

    }

    @Override
    public boolean showWarning() {
        if(quantity > householdLimit){
            return true;
        } else return false;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
