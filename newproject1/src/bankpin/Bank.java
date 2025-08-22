package bankpin;

public class Bank {
	private int pin;

    public void setPin(int p)  
    {
        pin = p;
        if (pin == 1001)
            System.out.println("Correct PIN");
        else if (pin == 1234)
            System.out.println("Correct PIN");
        else if (pin == 1212)
            System.out.println("Correct PIN");
        else
            System.out.println("Wrong PIN");
    }
}
