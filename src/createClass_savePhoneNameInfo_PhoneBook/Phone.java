package createClass_savePhoneNameInfo_PhoneBook;

public class Phone<Name, Tel> {

	private Name name;
	private Tel tel;

	public Phone(Name name, Tel tel) {
		this.name = name;
		this.tel = tel;
	}

	public Name getName() {
		return name;
	}

	public Tel getTel() {
		return tel;
	}

}
