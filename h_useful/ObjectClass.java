package h_useful;

public class ObjectClass {
	
	int a = 10;
	String b = "abc";
	
	ObjectClass(int a, String b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	public static void main(String[] args) {
		ObjectClass oc = new ObjectClass(10, "abc");
		ObjectClass oc2 = new ObjectClass(20, "def");
		ObjectClass oc3 = new ObjectClass(10, "abc");
		
		System.out.println(oc.equals(oc2));
		System.out.println(oc.equals(oc3));
	}

	@Override
	public String toString() {
		return "ObjectClass [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
