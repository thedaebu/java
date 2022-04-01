import java.util.ArrayList;
import java.util.HashMap;

public class java_project {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		java_project.wassup();
		
		var example = new java_project();
		example.ahnnyoung();
		
		Integer intArray[] = new Integer[2];
		System.out.println(intArray.length);
		
		ArrayList<Integer> integerArray = new ArrayList<Integer>();
		integerArray.add(213);
		integerArray.add(222);
		System.out.println(integerArray.get(1));
		
//		Character chars[] = {'e','a','b'};
		char[] chars = {'e','b'};
//		chars[0] = 'e';
		String word = new String(chars);
		System.out.println(word);
		
		HashMap<String, String> hasher = new HashMap<String, String>();
		hasher.put("Ichiro", "Suzuki");
		System.out.println(hasher);
	}
	
	public static void wassup() {
		System.out.println("wassup");
	}
	
	public void ahnnyoung() {
		System.out.println("ahnnyoung");
	}

}