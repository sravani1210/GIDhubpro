package sam;

import java.util.HashSet;

public class MainApp {
	public static void main(String[] args) {
		HashSet<RE>r=new HashSet<>();
		r.add(new RE(2301, "suma"));
		r.add(new RE(2302, "bbb"));
		r.add(new RE(2301, "sam"));
		r.add(new RE(2305, "nag"));
		r.add(new RE(2305, "nag"));
		RE re1=new RE(1, "sar");
		RE re2=new RE(1, "sar");
		RE re3=new RE(1, "sar");
		System.out.println(r);
		HashSet<String>r1=new HashSet<>();
		r1.add("ear");
		r1.add("ear");
		System.out.println(r1);
		System.out.println("re1:"+re1.hashCode());
		System.out.println("re2:"+re2.hashCode());
		System.out.println("re3:"+re3.hashCode());

	}
}
