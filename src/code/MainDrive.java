package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		문희원
		
		int[] questionArr = new int[3];
		int[] answerArr = new int[3];
		
		for (int i = 0; i < questionArr.length; i++) {
			
			while (true) {
				int randomNum = (int) (Math.random()*9 + 1);
				
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
				
				questionArr[i] = randomNum;
			}
		}
		
		for (int num : questionArr) {
			System.out.println(num);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 숫자를 입력해라 : ");
		int inputNum = scan.nextInt();
		
	}
}
