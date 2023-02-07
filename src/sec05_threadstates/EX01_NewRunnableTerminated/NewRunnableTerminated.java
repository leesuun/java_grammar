package sec05_threadstates.EX01_NewRunnableTerminated;

public class NewRunnableTerminated {

	synchronized static void notifyRun(Thread myThread) {
		myThread.notify();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread.State state;

		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 1000000L; i++) {
				}
			}
		};
		state = myThread.getState();
		System.out.println("myThread state: " + state);

		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state: " + state);

		try {
			myThread.join();
		} catch (InterruptedException e) {

		}
		state = myThread.getState();
		System.out.println("myThread state: " + state);

		try {
			notifyRun(myThread);

		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("myThread state: " + state);

	}

}
