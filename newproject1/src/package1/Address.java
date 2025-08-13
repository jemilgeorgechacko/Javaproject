package package1;

public class Address extends Student {
	   String address;

	    Address(String n, int r, String addr) {
	        super(n, r); 
	        address = addr;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + roll);
	        System.out.println("Address: " + address);
	    }
	


	    public static void main(String[] args) {
	        Address obj = new Address("jemil", 25, "aranmula");
	        obj.display();
	}

}
