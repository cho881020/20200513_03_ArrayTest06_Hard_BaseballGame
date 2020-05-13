package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		// 김정민
		
		int[] questionArr = new int[3];
		int[] answerArr = new int[3];
		
		for (int i=0 ; i < questionArr.length ; i++) {
			while (true) {
				int randomNum = (int) (Math.random() * 9 + 1);
				
				boolean isDuplOk = true;
				for (int num : questionArr) {
					if (randomNum == num) {
						isDuplOk = false;
						break;
					}
				}
				
				if (isDuplOk) {
					questionArr[i] = randomNum;
					break;
					
				}
			}
		}
		
		for (int num : questionArr) {
			System.out.println(num);
		}
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("세자리 숫자 입력 : ");
			int inputNum = scan.nextInt();
			
			answerArr[0] = inputNum / 100;
			answerArr[1] = inputNum / 10 % 10;
			answerArr[2] = inputNum % 10;
			
			int strikeCount = 0;
			int ballCount = 0;
			
			for (int i=0 ; i < answerArr.length ; i++) {
				
				for (int j=0 ; j < questionArr.length ; j++) {
					
					if (answerArr[i] == questionArr[j]) {
						
						if (i == j) {
							strikeCount++;
						}
						else {
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			System.out.println(strikeCount+"S "+ballCount+"B 입니다.");
			
			if (strikeCount == 3) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
		
	}
	
}
