package day07;

import java.util.Scanner;

public class Quiz01_t2 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int arr[] =new int[] {10,54,13,17,25,30};
		String odd_even=null;
		int i;
		System.out.print("¦��, Ȧ�� �Է����ּ��� : ");
		odd_even =pulls.next();
		if(odd_even.equals("¦��")) {
			for(i=0;i<arr.length;i++) {
				if(arr[i]%2==0)
					System.out.println("¦�� : "+arr[i]);
			}
		}else if(odd_even.equals("Ȧ��")) {
			for(i=0;i<arr.length;i++) {
				if(arr[i]%2==1)
					System.out.println("Ȧ�� : "+arr[i]);
			}
		}else
			System.out.println("�������� �ʴ� �ܾ��Դϴ�. ");
	}
}
