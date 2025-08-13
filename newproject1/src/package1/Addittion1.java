package package1;

public class Addittion1 extends Addittion{
	Addittion1(int a,int b)
	{
			super(a,b);
	}
	public void display2()
	{
	
	if (sum % 10==0) {
		System.out.println(sum+"is divisible by 10");
	}
	else 
	{
		System.out.println(sum+" is not sivisible by 10");
		
	}
}
	public static void main(String[] args) {
		Addittion1 c=new Addittion1(25,15);
		c.display();
		c.display2();

	}

}
