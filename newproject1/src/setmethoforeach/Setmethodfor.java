package setmethoforeach;

import java.util.HashSet;
import java.util.Set;

public class Setmethodfor {

	public static void main(String[] args) {
		Set<String> a = new HashSet<String>();
		Set<String> s = new HashSet<>();
		s.add("jemil");
        s.add("george");
        s.add("Chacko");
        a.add("puma");
        a.add("nike");
        a.add("adidas");
        System.out.println(s.size());
        System.out.println(s.contains("jemil"));
        System.out.println(s.isEmpty());
        s.clear();
        System.out.println(s);
        System.out.println(s.containsAll(a));
        System.out.println(a.containsAll(s));
        s.remove("apple");
        System.out.println(s);
        s.removeAll(a);
        System.out.println(s);
        for (String n:a) {
         System.out.println(n);

	}

}
}
