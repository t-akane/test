package kadai1;

public class Person {
	private String name=null;
	private int age=0;

	Person(String name,int age){
		this.name=name;
		this.age=age;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

}