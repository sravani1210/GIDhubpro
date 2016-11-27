package sam;


public class a {
	Integer b =6;
	public int m(){
		Integer a = 3;
		final int prime =10;
		int r=1;
		r=prime *r +((a == null) ? 0 :a.hashCode());
		return r;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	public static void main(String[] args) {
			/*HashSet<RE>r=new HashSet<>();
			r.add(new RE(2301, "suma"));
			r.add(new RE(2302, "bbb"));
			r.add(new RE(2301, "suma"));
			r.add(new RE(2305, "nag"));
			System.out.println(r);*/
		a a=new a();
		System.out.println(a.m());
		}
	}

