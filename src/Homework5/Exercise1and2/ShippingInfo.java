package Homework5.Exercise1and2;

public class ShippingInfo {
    private String city;
    private int zip;
    private String country;

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if(city == null || city.isEmpty()){
            throw new InvalidShippingInfoException();
        }
        if(zip < 0){
            throw new InvalidShippingInfoException();
        }
            this.city = city;
            this.zip = zip;
            this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
