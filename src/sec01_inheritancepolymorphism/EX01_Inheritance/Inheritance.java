package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human {
	String name;
	int age;

	void eat() {
		System.out.println(this.name + "이 먹는다");
	}

	void seelp() {
		System.out.println(this.name + "가 잠을 잔다");

	}

}

class Student extends Human {
	int studentId;

	Student(int age, int studentId, String who) {
		this.age = age;
		this.studentId = studentId;
		this.name = who;

	}

	void goToSchool() {
		System.out.printf("%d학번 %d살 %s가 학교에 간다\n", this.studentId, this.age, this.name);
	}

}

class Worker extends Human {
	int pressureOfBusiness;

	Worker(int age, int pressureOfBusiness, String who) {
		this.age = age;
		this.pressureOfBusiness = pressureOfBusiness;
		this.name = who;
	}

	void goToCompany() {
		System.out.printf("%d사번 %d살 %s가 회사에 간다\n", this.pressureOfBusiness, this.age, this.name);
	}

}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(20, 12345678, "LEESU");
		lee.goToSchool();
		lee.seelp();

		Worker kim = new Worker(20, 87654321, "KIMBG");
		kim.goToCompany();
		kim.seelp();

	}

}
