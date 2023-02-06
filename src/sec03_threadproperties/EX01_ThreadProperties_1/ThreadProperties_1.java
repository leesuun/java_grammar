package sec03_threadproperties.EX01_ThreadProperties_1;

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 10000000; i++) {

		}
		System.out.println(getName() + " �켱����:" + getPriority());
	}
}

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Thread curThread = Thread.currentThread(); System.out.println("���� �������� �̸� = "
		 * + curThread.getName()); System.out.println("�����ϴ� �������� ���� = " +
		 * Thread.activeCount());
		 * 
		 * Thread thread; for (int i = 1; i <= 3; i++) { thread = new Thread();
		 * 
		 * if (i == 1) { thread.setPriority(3); thread.setName(3 + "��° ������"); } else if
		 * (i == 2) { thread.setPriority(2); thread.setName(2 + "��° ������"); } else {
		 * thread.setPriority(1); thread.setName(1 + "��° ������"); }
		 * System.out.println(thread.getName()); thread.start(); for (int j = 0; j <
		 * 1000000; j++) {
		 * 
		 * } System.out.println(thread.getName()); }
		 * 
		 * System.out.println(Thread.activeCount());
		 */

		System.out.println("�ھ� ��: " + Runtime.getRuntime().availableProcessors());

		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "��° ������");
			if (i == 9)
				thread.setPriority(10);
			thread.start();
		}

	}

}
