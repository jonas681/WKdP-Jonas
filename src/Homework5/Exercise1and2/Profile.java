package Homework5.Exercise1and2;

public class Profile {

    //private String [] shippingInfo = new String[4]; //erstellt ein String-Array der Länge 4
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException();
        }
        this.shippingInfo = shippingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
