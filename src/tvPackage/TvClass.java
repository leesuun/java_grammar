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
		System.out.printf("%d인치 %d컬러", this.getSize(), color);
	}
}

class IPTV extends ColorTV {

	private String ip;

	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러", ip, this.getSize(), this.color);
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
[ IPTV 타입의 iptv의 인스턴스 생성 과정 ]

	- IPTV iptv = new IPTV("192.1.1.2",32,2048) 구문의 동작
	1. IPTV 클래스의 생성자를 호출한다.
	2. IPTV 클래스의 슈퍼 메서드를 통해 ColorTV의 생성자를 호출한다.
	3. ColorTV 클래스의 생성자를 호출한다.
	4. ColorTV 클래스의 슈퍼 메서드를 통해 TV의 생성자를 호출한다.
	5. TV클래스의 생성자를 호출한다.
	6. TV클래스의 private int size를 초기화한다 
	- 이때  size는 ColorTV에서 super메서드로 보내준 매개변수로 초기화된다.
	7. TV클래스의 생성자를 호출해서 size를 초기화 한 후 getSize 메서드를 가지는 TV클래스가
	생성된다.
	8. 다시 ColorTV 클래스의 생성자로 이동후 color 멤버 변수를 초기화한다.
	9. printProperty 메서드를 가지는 ColorTV클래스가 생성된다.
	10. 다시 IPTV 클래스의 생성자로 이동후 ip멤버 변수를 초기화한다.
	11. 메서드 오버라이딩 된 printProperty를 가지는 IPTV 클래스가 생성된다.
	12. IPTV 타입을 가지는 실제 사용가능한 iptv 인스턴스가 생성.
	
	- iptv.printProperty() 구문의 동작
	1. IPTV 타입의 iptv클래스에 존재하는 오버라이딩 된 메서드 printProperty()를 호출한다.
	2. ip는 IPTV의 멤버 변수 사용.
	3. this.color = color로 IPTV클래스에 color가 존재하지 않아서 상위 부모의 color를 사용.
	4. this.getSize() = getSize()로 TV 클래스에 존재하는 private멤버 변수의 값을 return해주는
	getSize()를 호출하여 size의 값을 출력.
*/