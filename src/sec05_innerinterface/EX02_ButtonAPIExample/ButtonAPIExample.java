package sec05_innerinterface.EX02_ButtonAPIExample;

class Button {

	OnClickListener ocl;

	void setOnClickListenerMusic() {
		this.ocl = new Button.OnClickListener() {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 1: 음악 재생");

			}
		};

	}

	void setOnClickListenerSearch() {
		this.ocl = new Button.OnClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 2: 네이버 접속");
			}
		};

	}

	static interface OnClickListener {
		public abstract void onClick();
	}

	void onClick() {
		ocl.onClick();

	}

}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button btn1 = new Button();
		System.out.println(btn1);
		btn1.setOnClickListenerMusic();
		btn1.onClick();

		Button btn2 = new Button();
		btn2.setOnClickListenerSearch();
		btn2.onClick();
	}

}
