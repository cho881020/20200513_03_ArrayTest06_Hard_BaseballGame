package code;

import java.util.Scanner;


public class MainDrive {

	public static void main(String[] args) {
		
		// 김하늬
		
		int[] question = new int[3];
		int[] answer = new int[3];
		
		
		for(int i=0;i<question.length;i++) {
			while(true) {
				int random = (int) (Math.random()*9+1);
				
				boolean isOk = true;
				//중복 피해야져
				for(int num : question) {
					if(random == num) {
						isOk = false;
						break;
					}
				}
				if(isOk) {
					question[i] = random;
					break; //다음칸에 넣을 숫자를 구하기위해 나감
				}
			}
			
		}
		
		for(int num : question) {
			System.out.println(num);
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("세자리 숫자 입력 : ");
			int inputNum = scan.nextInt();
			
			answer[0] = inputNum/100;
			answer[1] = (inputNum/10)%10;
			answer[2] = inputNum%10;
//			세자리 숫자 배열로 하나씩 받아내기
			
			int strike = 0;
			int ball = 0;
			
			for(int i=0;i<answer.length;i++) {
				for(int j=0;j<question.length;j++) {
					if(answer[i]==question[j]) {//숫자도 같고
						if(i==j) { //위치도 같고
							strike++;
						}
						else { //위치는 다름
							ball++;
						}
					}
				}
			}
			System.out.println(strike+"S"+ball+"B");
			if(strike ==3) {
				System.out.println("정답입니다");
				System.out.println("게임을 종료합니다");
				break; //종료시켜버렷
			}
		}
		
	}
	
}
