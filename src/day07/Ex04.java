package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ArrayList food =new ArrayList();
		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		System.out.println(food);
		System.out.println("ã�� �� �Է�: ");
		String n=input.next();
		System.out.println(n+" ��ġ : "+food.indexOf(n));
		System.out.println(food);
		food.set(2, "���");
		System.out.println(food);
	}
}
