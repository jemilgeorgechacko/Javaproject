package package1;

public class Studentdetails {
	String name;
	 int rollno ;
 public Studentdetails(String n,int r) {
		name=n;
		rollno=r;
	
 }
 void display()
 {
	 System.out.println("Name:"+name);
	 System.out.println("Roll:"+rollno);
 }
 public static void main(String[] args) {
 Studentdetails s=new Studentdetails("alex",25);
 s.display();

 }
}
