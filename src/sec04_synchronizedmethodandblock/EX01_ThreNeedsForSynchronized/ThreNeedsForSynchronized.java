package sec04_synchronizedmethodandblock.EX01_ThreNeedsForSynchronized;

class MyData {
	int data = 3;

	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	synchronized void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "ÃÊ");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	void cde() {
		synchronized (new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "¹øÂ°");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

}

class PlusThread extends Thread {
	MyData myData;

	PlusThread(MyData myData) {
		this.myData = myData;
	}

}

public class ThreNeedsForSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData myData = new MyData();

		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();

	}

}
