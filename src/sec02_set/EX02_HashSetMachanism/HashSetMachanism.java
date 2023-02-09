package sec02_set.EX02_HashSetMachanism;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class C {
	int data;

	C(int data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof C) {
			this.data = ((C) obj).data;
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.data);
	}
}

public class HashSetMachanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<C> hashSet = new HashSet<>();

		C c1 = new C(0);
		C c2 = new C(2);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " " + c2.hashCode());
		hashSet.add(c1);
		hashSet.add(c2);

		System.out.println(hashSet.size());
		System.out.println(hashSet);

	}

}
