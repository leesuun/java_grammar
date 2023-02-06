package sec03_threadproperties.EX01_ThreadProperties_1;

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 10000000; i++) {

		}
		System.out.println(getName() + " 우선순위:" + getPriority());
	}
}

public class ThreadProperties_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Thread curThread = Thread.currentThread(); System.out.println("현재 쓰레드의 이름 = "
		 * + curThread.getName()); System.out.println("동작하는 쓰레드의 개수 = " +
		 * Thread.activeCount());
		 * 
		 * Thread thread; for (int i = 1; i <= 3; i++) { thread = new Thread();
		 * 
		 * if (i == 1) { thread.setPriority(3); thread.setName(3 + "번째 쓰레드"); } else if
		 * (i == 2) { thread.setPriority(2); thread.setName(2 + "번째 쓰레드"); } else {
		 * thread.setPriority(1); thread.setName(1 + "번째 쓰레드"); }
		 * System.out.println(thread.getName()); thread.start(); for (int j = 0; j <
		 * 1000000; j++) {
		 * 
		 * } System.out.println(thread.getName()); }
		 * 
		 * System.out.println(Thread.activeCount());
		 */

		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());

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
			thread.setName(i + "번째 쓰레드");
			if (i == 9)
				thread.setPriority(10);
			thread.start();
		}

	}

}
