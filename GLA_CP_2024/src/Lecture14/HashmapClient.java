package Lecture14;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String ,Integer> map = new Hashmap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("A", 60);
		map.put("F", 100);
		
		map.remove("E");
		System.out.println(map);
		
//		System.out.println(map);
//		System.out.println(map.containsKey("Z"));
//		System.out.println(map.get("A"));
		
	}

}
