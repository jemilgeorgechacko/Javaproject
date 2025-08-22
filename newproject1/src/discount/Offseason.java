package discount;

public class Offseason {
	public void discount(double price) {
        double discount = price * 0.15;
        double finalPrice = price - discount;
        System.out.println("Off Season: Final price after 15% discount = " + finalPrice);
    }

}
