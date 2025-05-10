package Homework5.Exercise1and2;

public class EComController {
    public static void main(String[] args) {
        try{
            ShippingInfo info = new ShippingInfo("Munich", -3, "Germany");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);
            System.out.println("Shipping to: " +
                    customer.getProfile().getShippingInfo().getCity());

            System.out.println("Shipping to: " +
                    customer.getShippingCity());
        }catch (InvalidShippingInfoException e) {
            System.err.println("City is empty or zip is negative");
        }catch (MissingShippingInfoException e){
            System.err.println("Missing shipping info");
        }catch (InvalidCustomerException e){
            System.err.println("Profile is missing or id is negative");
        }



    }
}
