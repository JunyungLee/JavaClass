import java.util.ArrayList;
import java.util.List;

public class Exam_StudentListManagerMain {
	/* (실습) List를 사용한 성적 처리
	사용클래스명 : StudentVO, StudentListManager - main() 메소드
	1. StudentVO 클래스를 사용해서
	   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
	   "홍길동", 100, 90, 81
	   "이순신", 95, 88, 92
	   "김유신", 90, 87, 77
	2. ArrayList 타입의 변수(list)에 저장하고
	3. list에 있는 전체 데이터 화면출력
	   성명   국어  영어  수학  총점  평균
	   ---------------------------------
	   홍길동  100  90  81   270  90.33
	   ...
	4. 김유신 국어 점수를 95 점으로 수정 후 김유신 데이터만 출력
	5. 전체 데이터 화면 출력
	========================================== */
	public static void main(String[] args) {
		StudentVO stu = new StudentVO("홍길동", 90, 80, 70);
		stu.computeTotAvg();
		StudentVO stu1 = new StudentVO("김유신", 40, 50, 60);
		stu1.computeTotAvg();
		StudentVO stu2 = new StudentVO("강감찬", 60, 50, 80);
		stu2.computeTotAvg();
		
		List<StudentVO> list = new ArrayList<StudentVO>();
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		
		System.out.println("--첫번째 데이터 출력 ----");
		StudentVO vo = list.get(0);
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTot());
		System.out.println(vo.getAvg());
		
		
		System.out.println("---반복문 처리 -> 3명 데이터 모두 출력 ----");
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor()+ "\t");
			System.out.print(list.get(i).getEng()+ "\t");
			System.out.print(list.get(i).getMath()+ "\t");
			System.out.print(list.get(i).getTot()+ "\t");
			System.out.print(list.get(i).getAvg()+ "\t");
			System.out.println();
		}
		
	}

}
