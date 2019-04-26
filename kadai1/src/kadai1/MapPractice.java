package kadai1;
import java.util.HashMap;
import java.util.Map;


public class MapPractice {
	public static void main(String[] args) {
	Map<String,Person>personMap=new HashMap<String,Person>();
//準備（１）
	Person sato = new Person("sato",28);
	Person monzen = new Person("monzen",22);
	Person suzuki = new Person("suzuki",31);

	personMap.put("佐藤",sato);
	personMap.put("門前",monzen);
	personMap.put("鈴木",suzuki);
//（２）
	if(personMap.containsKey("門前")){
		System.out.println("門前さんはいます");
		}else{
		System.out.println("門前さんはいません");
		}
//（３）
	int maxAge=0;
	for(Map.Entry<String, Person> entry:personMap.entrySet()){
		if(maxAge<entry.getValue().getAge())
		maxAge=entry.getValue().getAge();
	}
		System.out.println(maxAge+"歳が最年長です");
//（４）
	for(Map.Entry<String, Person> e:personMap.entrySet()){
		System.out.println(e.getKey()+"は"+e.getValue().getAge()+"歳");
	}


	}
}
