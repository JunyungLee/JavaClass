import java.util.Scanner;

public class Ex07_Scanner_Exam {

	public static void main(String[] args) {
		//(실습) 카페 음료 주문 처리
		//음료의 종류 : 
		//1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000)
		//-------------------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		//----------------------------------------
		/*
		 * 반복 처리 = while (true) { // 메뉴선택 0 선택시 종료
		 1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000) 0.종료
		 > 메뉴를 선택하세요 (1~4) : 1 
		 > 주문수량 : 3
		 > 입금액 : 10000 
		 ==============
		 입금액 : 10000 원 
		 판매액 : 9000 원
		 잔액 : 10000 - 9000 = 1000 원
		 ==============
		 계속 주문하시겠습니까?
		 }
		 */
		
		System.out.println("-----Menu List------");
		int Am = 3000;
		int Cl = 3500;
		int Cm = 4000;
		int Fj = 5000;
		int tot = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("----번호를 입력하세요: ");
		int selectNum = scan.nextInt();
		
		System.out.print("주문 수량을 입력해주세요 : ");
		int countNum = scan.nextInt();
		
		
		System.out.print("입금하실 금액을 입력해주세요 : ");
		int deposit = scan.nextInt();
		
		if (selectNum == 1) {
			tot = Am * countNum;
		} else if (selectNum == 2) {
			tot = Cl * countNum;
		} else if (selectNum == 3) {
			tot = Cm * countNum;
		} else if (selectNum == 4) {
			tot = Fj * countNum;
		}
		
		int rest = deposit - tot;
		
		System.out.println("선택한 번호는 "+ selectNum + "입니다");
		System.out.println("주문한 수량은 " + countNum + "입니다");
		System.out.println("입금하신 금액은 " + deposit + "입니다");
		System.out.println("잔액은 " + rest + "입니다");
		

	}

}
