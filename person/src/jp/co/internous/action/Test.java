package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="08011112222";
		taro.address="千葉県";

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="08033334444";
		jiro.address="神奈川県";


		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="08055556666";
		hanako.address="埼玉県";


		Person akane=new Person();
		akane.name="舘野茜";
		akane.age=29;
		akane.phoneNumber="08077778888";
		akane.address="東京都";


		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();


		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		System.out.println(akane.name);
		System.out.println(akane.age);
		System.out.println(akane.phoneNumber);
		System.out.println(akane.address);
		akane.talk();
		akane.walk();
		akane.run();


		Robot aibo=new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();






	}

}
