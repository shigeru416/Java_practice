package a.animal;

public class Dog extends Animal {

	//引数なしのコンストラクタ
	public Dog() {
		this.name = "犬";
	}

	public void cry() {
		System.out.println(this.name+"が吠えました。ワンワン！");
	}
}
