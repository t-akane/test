package kadai1;
import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {


	Person sato = new Person("sato",28);
	Person monzen = new Person("monzen",22);
	Person suzuki = new Person("suzuki",31);

	List<Person> personList = new ArrayList<Person>();

	personList.add(sato);
	personList.add(monzen);
	personList.add(suzuki);

	for(Person p:personList){
		System.out.println(p.getName()+"は"+p.getAge()+"歳");
	}

	int i=0;
	for(i=0;i<3;i++){
		System.out.println(i+1+"件目は"+personList.get(i)+"さんです");
	}

}
}
