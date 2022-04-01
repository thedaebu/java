import java.util.ArrayList;
import java.util.HashMap;

public class java_project {	
	
	int value1;
	int value2;
	
	java_project() {
		value1 = 10;
		value2 = 20;
	}
	
	java_project(int a) {
		value1 = 10;
		value2 = a;
	}
	
	public void display() {
		System.out.println("Value1 = "+value1);
		System.out.println("Value2 = "+value2);
	}
	
	public static void main(String[] args) {
//		java_project.wassup();
//		
//		var example = new java_project();
//		example.ahnnyoung();
//		
//		Integer intArray[] = new Integer[2];
//		System.out.println(intArray.length);
//		
//		ArrayList<Integer> integerArray = new ArrayList<Integer>();
//		integerArray.add(213);
//		integerArray.add(222);
//		System.out.println(integerArray.get(1));
//		
//		char[] chars = {'e','b'};
//		String word = new String(chars);
//		System.out.println(word);
//		
//		HashMap<String, String> hashMap = new HashMap<String, String>();
//		hashMap.put("Shoehi", "Ohtani");
//		System.out.println(hashMap);
		
		java_project javaness = new java_project();
		javaness.display();
		java_project javaness2 = new java_project(16);
		javaness2.display();
	}
	
	public static void wassup() {
		System.out.println("wassup");
	}
	
	public void ahnnyoung() {
		System.out.println("ahnnyoung");
	}

}