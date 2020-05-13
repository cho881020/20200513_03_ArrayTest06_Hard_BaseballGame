package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		// 야구게임 - 구현정 
		int[] questionArr = new int[3];
		int[] answerArr = new int[3];
		
		for(int i=0;i<questionArr.length;i++) {
			while(true) {				
				int randomNum = (int)(Math.random()*9+1);
				boolean isDuplOk = true;
				for(int num : questionArr) {
					if(randomNum == num) {
						isDuplOk = false;
						break;
					}
				}
				if(isDuplOk) {					
					questionArr[i] = randomNum;
			
					break;
				}
			}
		}
		for(int num : questionArr) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		int inputCount = 0;
		
		while(true) {			
			System.out.print("세자리 숫자를 입력하세요: ");
			int strikeCount = 0;
			int ballCount = 0;
			// strike, count 갯수를 계속해서  reset시키기 위해서 while문 안에 strike&ball 선언.
			
			int inputNum = scan.nextInt();
			inputCount++;
			answerArr[0] = inputNum/100;
			answerArr[1] = (inputNum/10)%10;
			answerArr[2] = inputNum%10;
			
			for(int i=0;i<answerArr.length;i++) {
				for(int j=0;j<questionArr.length;j++) {
					if(answerArr[i]==questionArr[j]) {
						if(i==j) {
							strikeCount++;
						} else {
							ballCount++;
						}
					}
				}
			}
			System.out.println(strikeCount+"S "+ballCount+"B");
			if(strikeCount == 3) {
				System.out.println(inputCount +"회 플레이 하셨습니다.");
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
	
}
