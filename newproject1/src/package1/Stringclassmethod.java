package package1;

public class Stringclassmethod {

	public static void main(String[] args) {
		String s="hello";
		String s1="world";
		String s2="hello";
		String s3="HELLO";
		String s5=("Hello");
		int a=10;
		String s4=String.valueOf(a);
		System.out.println(s.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s.startsWith("he"));
		System.out.println(s.endsWith("o"));
		System.out.println(s1.charAt(1));
		System.out.println(s4);

	}

}
