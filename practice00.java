
public class practice00 {
	public static void main(String[] args) {
        // practice01クラスを引数なしコンストラクタでインスタンスを生成
        practice01 yamada = new practice01();
        // 初期値が設定されたフィールドを参照して表示
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        // practice01クラスを引数ありコンストラクタでインスタンスを生成
        practice01 sato = new practice01("佐藤", 25);
        // 引数の値が設定されたフィールドを参照して表示
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}
