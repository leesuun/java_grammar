package tvPackage;

//import java.util.Scanner;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {

	protected int color;

	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d��ġ %d�÷�", this.getSize(), color);
	}
}

class IPTV extends ColorTV {

	private String ip;

	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	void printProperty() {
		System.out.printf("���� IPTV�� %s �ּ��� %d��ġ %d�÷�", ip, this.getSize(), this.color);
	}

}

public class TvClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);


		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

		iptv.printProperty();

	}
}

/*
[ IPTV Ÿ���� iptv�� �ν��Ͻ� ���� ���� ]

	- IPTV iptv = new IPTV("192.1.1.2",32,2048) ������ ����
	1. IPTV Ŭ������ �����ڸ� ȣ���Ѵ�.
	2. IPTV Ŭ������ ���� �޼��带 ���� ColorTV�� �����ڸ� ȣ���Ѵ�.
	3. ColorTV Ŭ������ �����ڸ� ȣ���Ѵ�.
	4. ColorTV Ŭ������ ���� �޼��带 ���� TV�� �����ڸ� ȣ���Ѵ�.
	5. TVŬ������ �����ڸ� ȣ���Ѵ�.
	6. TVŬ������ private int size�� �ʱ�ȭ�Ѵ� 
	- �̶�  size�� ColorTV���� super�޼���� ������ �Ű������� �ʱ�ȭ�ȴ�.
	7. TVŬ������ �����ڸ� ȣ���ؼ� size�� �ʱ�ȭ �� �� getSize �޼��带 ������ TVŬ������
	�����ȴ�.
	8. �ٽ� ColorTV Ŭ������ �����ڷ� �̵��� color ��� ������ �ʱ�ȭ�Ѵ�.
	9. printProperty �޼��带 ������ ColorTVŬ������ �����ȴ�.
	10. �ٽ� IPTV Ŭ������ �����ڷ� �̵��� ip��� ������ �ʱ�ȭ�Ѵ�.
	11. �޼��� �������̵� �� printProperty�� ������ IPTV Ŭ������ �����ȴ�.
	12. IPTV Ÿ���� ������ ���� ��밡���� iptv �ν��Ͻ��� ����.
	
	- iptv.printProperty() ������ ����
	1. IPTV Ÿ���� iptvŬ������ �����ϴ� �������̵� �� �޼��� printProperty()�� ȣ���Ѵ�.
	2. ip�� IPTV�� ��� ���� ���.
	3. this.color = color�� IPTVŬ������ color�� �������� �ʾƼ� ���� �θ��� color�� ���.
	4. this.getSize() = getSize()�� TV Ŭ������ �����ϴ� private��� ������ ���� return���ִ�
	getSize()�� ȣ���Ͽ� size�� ���� ���.
*/