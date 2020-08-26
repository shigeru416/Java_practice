package introduction.info;

public class Info {
	private String name;
	private int age;
	private String comefrom;
	private String hobby;

	public Info(String name, int age, String comefrom, String hobby) {
		this.name = name;
		this.age = age;
		this.comefrom = comefrom;
		this.hobby = hobby;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public String getHobby() {
		return this.hobby;
	}
}
