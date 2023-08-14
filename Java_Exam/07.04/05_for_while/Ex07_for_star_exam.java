
public class Ex07_for_star_exam {

	public static void main(String[] args) {
		/* 문제1 -----------------
		***** : *5번 + 줄바꿈
		****  : *4번 
		***   : *3번	
		**
		*	
		-----------------------*/
		int starCnt = 5; 
		//5번 반복 |
		for (int i = 1; i <= starCnt; i++) {
				System.out.print("*");
		}
		System.out.println();
		starCnt--;
		System.out.println("------------------------");
		
		starCnt = 5;
		for(int j = 1; j <= 5; j++) {
			for (int i = 1; i <= starCnt; i++) {
				System.out.print("*");
			}
			System.out.println();
			starCnt--;
		}
		
		System.out.println();
		System.out.println("--------------------------");
		int cnt = 5;
		for(int i = 5; i >= 1; i--) {
			for (int j = 1; j <= cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			cnt--;
		}
		System.out.println("=======2번=========");
		/* 문제 2--------------------
		     * : 빈칸 4 + * 1개 + 줄바꿈
		    ** : 빈칸 3 + * 2개 + 줄바꿈
		   *** : 빈칸 2 + * 3개 + 줄바꿈
		  ****
		 *****
		 ----------------------------*/ 
		//1번째
		for(int i = 1; i <= 4; i++) {
			System.out.print(" ");
		}
		for(int j= 1; j <= 1; j++) {
			System.out.print("*");
		} 
		System.out.println();
		
		//2번째
		for(int i = 1; i <= 3; i++) {
			System.out.print(" ");
		}
		for(int j= 1; j <= 2; j++) {
			System.out.print("*");
		} 
		System.out.println();
		
		//3번째
		for(int i = 1; i <= 2; i++) {
			System.out.print(" ");
		}
		for(int j= 1; j <= 3; j++) {
			System.out.print("*");
		} 
		System.out.println();
		
		//4번째
		for(int i = 1; i <= 1; i++) {
			System.out.print(" ");
		}
		for(int j= 1; j <= 4; j++) {
			System.out.print("*");
		} 
		System.out.println();
		
		//5번째
		for(int i = 1; i <= 0; i++) {
			System.out.print(" ");
		}
		for(int j= 1; j <= 5; j++) {
			System.out.print("*");
		} 
		System.out.println();
		System.out.println("-------------");
		int spaceCnt = 4;
		starCnt = 1;
		for(int line = 1; line <= 5; line++) {
			for(int i= 1; i <= spaceCnt; i++) {
				System.out.print(" ");
			}
			for(int j= 1; j <= starCnt; j++) {
				System.out.print("*");
			} 
			System.out.println();
			spaceCnt--;
			starCnt++;
		}
		System.out.println("==========3번==========");
	
		/* 문제 3 ---------------------
		 ***** : 빈칸 0, * 5개, 줄바꿈
		  **** : 빈칸 1, * 4개, 줄바꿈
		   *** : 빈칸 2, * 3개, 줄바꿈
		    **
		     *
		--------------------------- */
		spaceCnt = 1;
		starCnt = 5;
		for(int star = 1; star <= 5; star++) {
			// 빈칸 출력 반복문 (0,1,2,3,4)
			for(int i = 1; i <= spaceCnt; i++) {
			System.out.print(" ");
			}
			// "*" 출력 반복문 (5,4,3,2,1)
			for(int j = 1; j <= starCnt; j++) {
			System.out.print("*");
			}
			System.out.println();
			spaceCnt++;
			starCnt--;
		}
		System.out.println("------------------------");
		//1번째
		for(int i = 1; i <= 1; i++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= 5; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//2번째
		for(int i = 1; i <= 2; i++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= 4; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//3번째
		for(int i = 1; i <= 3; i++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= 3; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//4번째
		for(int i = 1; i <= 4; i++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= 2; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//5번째
		for(int i = 1; i <= 5; i++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= 1; j++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		
		System.out.println("===========4번 문제 =========");
		
		/*문제 4-----------------------
		 1         : ( 1 + 빈칸 1개) + 줄바꿈
		 1 2       : ( 1 + 빈칸 1) + (2 + 빈칸 1) + 줄바꿈
		 1 2 3
		 1 2 3 4
		 -------------------------------*/	
	    int num = 1;
	    //1번째
		for(int i = 1; i <= 1; i++) {
			System.out.print(num);
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();

		//2번째
		for(int i = 1; i <= 2; i++) {
			System.out.print(num);
			num++;
		} 
	
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();

		//3번째
		num = 1;
		for(int i = 1; i <= 3; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		//4번째
		num = 1;
		for(int i = 1; i <= 4; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		num = 1;
		spaceCnt = 1;
		
		for(int number = 1; number <= 4; number++) {
			for(int i = 1; i <= spaceCnt; i++) {
				System.out.print(num);
				num++;
			} 
			for (int j = 1; j <= 4; j++) {
				System.out.print(" ");
			}
			System.out.println();
			num = 1;
			spaceCnt++;
		}
		System.out.println("=======5번 문제 ============");
	
		/* 뮨제 5 -----------------------
		 1 
		 2 3
		 4 5 6
		 7 8 9 10
		 ------------------------------*/
		num = 1;
		spaceCnt = 1;
		
		for(int number = 1; number <= 4; number++) {
			for(int i = 1; i <= spaceCnt; i++) {
				System.out.print(num);
				num++;
			} 
			for (int j = 1; j <= 4; j++) {
				System.out.print(" ");
			}
			System.out.println();
			spaceCnt++;
		}	
		System.out.println("-------5번 설명-----------");
		num = 1;
		spaceCnt = 1;
		
		for(int i = 1; i <= 1; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		spaceCnt++;
			
		for(int i = 1; i <= 2; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		spaceCnt++;
			
		for(int i = 1; i <= 3; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		spaceCnt++;
			
		for(int i = 1; i <= 4; i++) {
			System.out.print(num);
			num++;
		} 
		for (int j = 1; j <= 4; j++) {
			System.out.print(" ");
		}
		System.out.println();
		spaceCnt++;
		
		System.out.println();
		
		System.out.println("=====6번문제========");
		
	  /* 추가 문제 6------------------
	   1 2 3 4 5 
	   1 2 3 4 5 
	   1 2 3 4 5 
	   --------------------*/
		
		//1~5까지 출력 후 
		// 3번 반복
		
		num = 1;
		for(int i = 1; i <= 5; i++) {
			System.out.print(num);
			System.out.print(" ");
			num++;
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 5; i++) {
			System.out.print(num);
			System.out.print(" ");
			num++;
		}
		System.out.println();
		
		num = 1;
		for(int i = 1; i <= 5; i++) {
			System.out.print(num);
			System.out.print(" ");
			num++;
		}
		System.out.println();

		System.out.println("---------------------------");
		
		num = 1;
		for(int line = 1; line <= 3; line++) {
			num = 1;
			for(int i = 1; i <= 5; i++) {
				System.out.print(num);
				System.out.print(" ");
				num++;
			} 
			System.out.println();
		}
		
	}

}
