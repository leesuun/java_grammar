package sec02_theneedforthread.EX2.CreateAndStartThread_M1C1;

class SMIFileThread extends Thread {

	@Override
	public void run() {
		String[] smiArray = { "�ϳ�", "��", "��", "��", "�ټ�" };
		try {
			Thread.sleep(10);

		} catch (Exception e) {
			// TODO: handle exception
		}

		for (int i = 0; i < smiArray.length; i++) {
			System.out.printf("(�ڸ� ��ȣ) %s\n", smiArray[i]);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}

class VideoFileThread extends Thread {
	@Override
	public void run() {
		int[] numberArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numberArray.length; i++) {
			System.out.printf("(���� ������) %d - ", numberArray[i]);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}

public class CreateAndStartThread_M1C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread SMIFileThread = new SMIFileThread();
		SMIFileThread.start();

		Thread VideoFileThread = new VideoFileThread();
		VideoFileThread.start();

	}

}
