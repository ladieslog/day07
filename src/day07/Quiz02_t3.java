package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02_t3 {
	public static void main(String[] args) {
		Scanner pulls =new Scanner(System.in);
		ArrayList name =new ArrayList();
		ArrayList tel =new ArrayList();
		String names,telNum,findName,removeName;
		int a,b,c,i;
		
		while(true) {
			System.out.print("1.����ó ���\n2.����ó ����\n3.����ó ����\n"
					+ "4.��� ����ó����\n5.�����ϱ� \n>>>>>");
			a=pulls.nextInt();
			if(a==1) {
					System.out.print("�̸��Է�");
					names=pulls.next();
					name.add(names);
					System.out.print("����ó�Է�");
					telNum=pulls.next();
					tel.add(telNum);
					System.out.println("���ο� ����� �����Ǿ����ϴ�.\n");
			}else if(a==2) {
				System.out.print("ã�� �̸� �Է�: ");
				findName=pulls.next();
				b=name.indexOf(findName);
				if(b==-1) {
					System.out.println(findName +"�� ��Ͽ� �����ϴ�.");
				}else {
					System.out.println( name.get(b)+" : "+tel.get(b));
				}
				System.out.println();
			}else if(a==3) {
				System.out.println("������ ��� �̸��Է�");
				removeName=pulls.next();
				c=name.indexOf(removeName);
				if(c==-1) {
					System.out.println(removeName +"�� ��Ͽ� �����ϴ�.");
				}else {
					name.remove(c);
					tel.remove(c);
					System.out.println("�� ���� �Ǿ����ϴ�.");
				}
				System.out.println();
			}else if(a==4) {
				for(i=0;i<name.size();i++) {
					System.out.println((i+1) +"."+ name.get(i)+" : "+tel.get(i));
				}

				System.out.println();
			}else if(a==5) {
				System.out.println("���α׷��� ���ᰡ �˴ϴ�. �����մϴ�.^^ ");
				break;
			}else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� \n");
			}
			
		}
	}
}











