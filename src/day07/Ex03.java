package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ArrayList arr=new ArrayList();
		int num,i;
		String addNum ,printNum;
		System.out.println("���� ������ ���� �Է�");
		num=input.nextInt();
		for(i=0;i<num;i++) {
			System.out.println("�߰��� �� �Է�");
			addNum=input.next();
			arr.add(addNum);
		}
		System.out.println("���� �� ���");
		for(i=0;i<arr.size();i++) {
			//System.out.println(arr.get(i));
			Object obj=arr.get(i);
			String s= (String)obj;
			String s1="aaa"+obj;
			System.out.println(obj);
		}
	}
}
