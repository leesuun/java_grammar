package finalAndabstract;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	// �߻� Ŭ������ ��ӹ��� �ڽ��� �θ��� �߻� �޼��带 �������̵� �ؾ���
	/* ���� 
	 * 1. ���߰������� ��Ÿ �߻� ����
	 * 2. �߻� Ŭ������ �߻� �޼��带 ��ӹ��� ��� �ڽ� Ŭ������ �׻� �θ��� �߻� �޼��尡 ���ǵǴ� ���� ���� 
	 */
	void cry() {
		System.out.println("����� r");
	}

	void cRy() {
		System.out.println("����� R");
	}

}

class Dog extends Animal {
	void cry() {
		System.out.println("������");
	}

}

public class abstractController {

	static public void main(String[] args) {

	}

}
