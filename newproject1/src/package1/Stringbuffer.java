package package1;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer s =new StringBuffer("hello ");
		s.append("world");
        System.out.println(s);
        StringBuffer s1 =new StringBuffer("hello world");
        s1.insert(6,"to ");
        System.out.println(s1);
        StringBuffer s2 =new StringBuffer("hello world");
        s2.delete(3,4);
        System.out.println(s2);
        StringBuffer s3 =new StringBuffer("hello world");
        s3.replace(5,6," to ");
        System.out.println(s3);
	}

}
