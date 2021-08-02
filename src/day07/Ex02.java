package day07;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//list , arraylist
		ArrayList arr =new ArrayList();
		
		arr.add("1233");
		arr.add("456");
		arr.add("789");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		System.out.println(arr.contains("123")); //존재여부 확인
		System.out.println(arr.remove(1));
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);
	}
}
