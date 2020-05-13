package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		// 야구 게임 : 유혜원

		int[] questionArr = new int[3];
		int[] answerArr = new int[3];
		
		
		for (int i = 0; i < questionArr.length; i++) {
//			 1<=(int) (Math.random()*9+1)<10	//랜덤넘버남겨두기	
			while(true) {
				
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
		System.out.print("세자리 숫자를 입력 : ");
		int inputNum = scan.nextInt();
		
		answerArr[0] = inputNum / 100;
		answerArr[1] = (inputNum / 10) % 10; // 가운데 자리수를 얻으려면 192 => 10으로 나누고 19.2 => 나머지 를 구한다.
		answerArr[2] = inputNum % 10;
		
		
	}

}
