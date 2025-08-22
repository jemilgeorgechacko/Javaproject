package discount;

public class Onseason extends Offseason  {
	public void discount(double price) {
        double discount = price * 0.40;
        double finalPrice = price - discount;
        System.out.println("On Season: Final price after 40% discount = " + finalPrice);
    }

	public static void main(String[] args) {
		 double price = 1000; 

		 Offseason obj = new Onseason();
	        obj.discount(price);

	        Onseason obj1 = new Onseason();
	        obj1.discount(price);
	

	}

}
