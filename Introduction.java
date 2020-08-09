package introduction;

import introduction.info.Info;

public class Introduction {
	public static void main(String[] args) {
		Info man = new Info("トム", 35, "America", "野球");

		man.setAge(5);
		System.out.println("名前："+man.getName()+"　年齢："+man.getAge()+"　出身地："+man.getComefrom()+"　：趣味："+man.getHobby());
	}
}
