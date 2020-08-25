
public class Fortune {
	public static void main(String[] args) {
		System.out.println("ようこそ、占いの館へ");

		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("あなたの年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();

		//0から4未満の数字をランダムに生成
		int fortune = new java.util.Random().nextInt(4);
		//0+1=1 1+1=2 2+1=3 3+1=4で占いの結果に対応
		fortune++;

		System.out.println("占いの結果が出ました");
		System.out.println(age+"際の"+name+"さんのあなたの運気番号は"+fortune+"です。");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		System.out.println("いかがでしたか。再度挑戦してみますか？")
	}
}
