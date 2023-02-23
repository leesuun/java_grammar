package concert;

public class Seat {
	private String name;

	public Seat() {
		name = null;
	}

	public String getName() {
		return name;
	}

	public void cancel() {
		name = null;
	}

	public void reserve(String name) {
		this.name = name;
	}

	public boolean isOccupied() {
		if (name == null) // 좌석이 예약되어 있으면 true 반환
			return false;
		else
			return true;
	}

	public boolean match(String name) {
		return (name.equals(this.name));
	}
}