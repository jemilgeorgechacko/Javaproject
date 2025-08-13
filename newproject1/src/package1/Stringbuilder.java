package package1;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder s =new StringBuilder("hello ");
		s.append("world");
        System.out.println(s);
        StringBuilder s1 =new StringBuilder("hello world");
        s1.insert(6,"to ");
        System.out.println(s1);
        StringBuilder s2 =new StringBuilder("hello world");
        s2.delete(3,4);
        System.out.println(s2);
        StringBuilder s3 =new StringBuilder("hello world");
        s3.replace(5,6," to ");
        System.out.println(s3);

	}

}
