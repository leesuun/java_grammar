package sec02_set.EX04_TreeSetMethod_2;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
	int data1, data2;

	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;

	}

}

public class TreeSetMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<MyClass> treeSet = new TreeSet<MyClass>(new Comparator<MyClass>() {

			@Override
			public int compare(MyClass o1, MyClass o2) {
				// TODO Auto-generated method stub
				if (o1.data1 < o2.data2)
					return -1;
				else if (o1.data1 == o2.data2)
					return 0;
				else
					return 1;
			}

		});

		MyClass myClass1 = new MyClass(2, 5);
		MyClass myClass2 = new MyClass(7, 3);
		treeSet.add(myClass1);
		treeSet.add(myClass2);
		for (MyClass mcc : treeSet) {
			System.out.println(mcc.data1);
		}

	}

}
