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
			System.out.print("1.연락처 등록\n2.연락처 보기\n3.연락처 삭제\n"
					+ "4.모든 연락처보기\n5.종료하기 \n>>>>>");
			a=pulls.nextInt();
			if(a==1) {
					System.out.print("이름입력");
					names=pulls.next();
					name.add(names);
					System.out.print("연락처입력");
					telNum=pulls.next();
					tel.add(telNum);
					System.out.println("새로운 목록이 생성되었습니다.\n");
			}else if(a==2) {
				System.out.print("찾을 이름 입력: ");
				findName=pulls.next();
				b=name.indexOf(findName);
				if(b==-1) {
					System.out.println(findName +"는 목록에 없습니다.");
				}else {
					System.out.println( name.get(b)+" : "+tel.get(b));
				}
				System.out.println();
			}else if(a==3) {
				System.out.println("삭제할 목록 이름입력");
				removeName=pulls.next();
				c=name.indexOf(removeName);
				if(c==-1) {
					System.out.println(removeName +"는 목록에 없습니다.");
				}else {
					name.remove(c);
					tel.remove(c);
					System.out.println("잘 삭제 되었습니다.");
				}
				System.out.println();
			}else if(a==4) {
				for(i=0;i<name.size();i++) {
					System.out.println((i+1) +"."+ name.get(i)+" : "+tel.get(i));
				}

				System.out.println();
			}else if(a==5) {
				System.out.println("프로그램이 종료가 됩니다. 감사합니다.^^ ");
				break;
			}else {
				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요 \n");
			}
			
		}
	}
}











