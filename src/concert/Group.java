package concert;


import java.util.Scanner;

public class Group {
	private char type; // 'S', 'A', 'B' 석을 나타내는 문자
	private Seat[] seats; // 현재 등급의 좌석 객체 배열
	private Scanner scanner = new Scanner(System.in);

	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num];
		for (int i = 0; i < num; i++) {
			seats[i] = new Seat();

		}

	}
	
	public Character getType() {
		return this.type;
	}

	// 현재 등급의 좌석 예약
	public boolean reserve() {
		int no;
		String name;
		show();
		System.out.print("예약자 닉네임:");
		name = scanner.next();
		System.out.print("좌석 번호:");
		no = scanner.nextInt();
		if (no < 1 || no - 1 >= seats.length) {
			System.out.println("유효하지 않은 좌석번호 입니다. 다시 예약해 주십시오.");
			System.out.println();
			return false;
		}
		if (seats[no - 1].isOccupied()) { // 이미 예약된 좌석 번호
			System.out.println("이미 예약된 좌석 입니다.");
			System.out.println();
			return false;
		}
		System.out.println();
		seats[no - 1].reserve(name);
		return true;
	}

	// 현재 등급의 좌석 취소
	public boolean cancel() {
		show();
		System.out.print("예약 취소자 이름:"); // 취소할 예약자 이름 입력
		String name = scanner.next();
		if (name != null) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].match(name)) {
					seats[i].reserve(null);
					System.out.println(name + " 님의 좌석 예약이 취소되었습니다.");
					return true;
				}
			}
		}
		return false; // 예약자 이름을 찾지 못함
	}

	// 현재 좌석 정보 출력
	public void show() {
		System.out.print(type + ">> ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) {
				System.out.printf(seats[i].getName() + " ");
			} else {
				System.out.printf("--" + (i + 1) + "번-- ");
			}

			System.out.print(" ");
		}

		System.out.println();
	}

	public boolean search(String name) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].match(name)) {
				System.out.printf(seats[i].getName() + " 고객님은 " + type + "석 " + i + "번 좌석 입니다.\r\n\n");
				return true;
			}
		}
		return false;

	}

}