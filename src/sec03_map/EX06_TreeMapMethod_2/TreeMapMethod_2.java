package sec03_map.EX06_TreeMapMethod_2;

import java.util.TreeMap;

class MyClass {
	int data1;
	int data2;

	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "data1 = " + data1 + "을 갖고 있는 클래스";
	}
}

class MyComparableClass implements Comparable<MyComparableClass> {
	int data1;
	int data2;

	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1 < o.data1)
			return -1;
		else if (this.data1 == o.data1)
			return 0;
		return 1;
	}

	@Override
	public String toString() {
		return "data1 = " + data1 + "을 갖고 있는 클래스";
	}

}

class A  implements Comparable<A>{
	int data1;
	int data2;

	A(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(A o) {
		if (this.data1 < o.data1)
			return -1;
		else if (this.data1 == o.data1)
			return 0;
		return 1;
	}

}

public class TreeMapMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, Integer> treeMap1 = new TreeMap<Integer, Integer>();
		// suport java version > 8
		Integer intValue1 = Integer.valueOf(100);
		// suport java version <= 8
		Integer intValue2 = new Integer(200);

		A a1 = new A(10,20);
		A a2 = new A(30,40);

		treeMap1.put(a1.data1, intValue1);
		treeMap1.put(a2.data2, intValue2);
		System.out.println(treeMap1.toString());
	}

}
