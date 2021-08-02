package day07;

import java.util.Scanner;

public class Quiz01_t2 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		int arr[] =new int[] {10,54,13,17,25,30};
		String odd_even=null;
		int i;
		System.out.print("짝수, 홀수 입력해주세용 : ");
		odd_even =pulls.next();
		if(odd_even.equals("짝수")) {
			for(i=0;i<arr.length;i++) {
				if(arr[i]%2==0)
					System.out.println("짝수 : "+arr[i]);
			}
		}else if(odd_even.equals("홀수")) {
			for(i=0;i<arr.length;i++) {
				if(arr[i]%2==1)
					System.out.println("홀수 : "+arr[i]);
			}
		}else
			System.out.println("존재하지 않는 단어입니다. ");
	}
}
