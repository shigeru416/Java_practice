package animal;

import animal.dog.Dog;

public class Profile {
	public static void main(String[] args) {
		Dog dog = new Dog("そら", 5);

		dog.setName("しん");
		dog.setAge(10);
		System.out.println("変更　名前："+dog.getName()+"　年齢："+dog.getAge());
	}
}
