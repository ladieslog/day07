package day07;

public class Ex01 {

	public static void main(String[] args) {
		//¹è¿­
		int[] arr=new int[5];
		int[] arr01= {1,2,3,4,5};
		int i;
		arr[0]=0000;
		arr[1]=1111;
		arr[2]=2222;
		arr[3]=3333;
		arr[4]=4444;
		System.out.println("arr 0 : " +arr[0]);
		System.out.println("arr 1 : " +arr[1]);
		System.out.println("arr 2 : " +arr[2]);
		System.out.println("arr 3 : " +arr[3]);
		System.out.println("arr 4 : " +arr[4]);
		System.out.println(arr.length);
		for (i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for (i=0;i<arr.length;i++) {
			System.out.println(arr01[i]);
		}
	}

}
