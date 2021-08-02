package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ArrayList food =new ArrayList();
		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		System.out.println(food);
		System.out.println("찾을 값 입력: ");
		String n=input.next();
		System.out.println(n+" 위치 : "+food.indexOf(n));
		System.out.println(food);
		food.set(2, "당근");
		System.out.println(food);
	}
}
