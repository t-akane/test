
public class HelloWorld {

	public static void main(String[] args) {
		// HelloWorld!の出力
		System.out.println("Hello World!");
		System.out.println("こんにちは！！");

		String name="田中";
		System.out.println(name);
		//文字列の場合はStringで
		//囲みはダブル。必須。

		System.out.println(name+"さん");

		char char1='A';
		System.out.println(char1);
		//文字が1つの場合は文字列ではないのでchar
		//シングルじゃないとだめ

		int num1=3+2;
		System.out.println(num1);
		//数字。囲みは必要ない。

		boolean boo =true;
		System.out.println(boo);

		int a =10/3;
		System.out.println(a);

		float b = 10/3;
		System.out.println(b);

		float c = (float)10/3;
		System.out.println(c);

		int aa=10;
		String bb = aa>=0 ? "プラス":"マイナス";
		System.out.println(bb);

		System.out.println(gokei());


}
	public static int gokei(){return 1+1;}
}