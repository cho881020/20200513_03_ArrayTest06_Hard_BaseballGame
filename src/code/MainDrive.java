package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		int[] questionArr = new int[3];
		int[] answerArr = new int[3];
		for (int i = 0; i < questionArr.length; i++) {
			while (true) {
				int randomNum = (int) (Math.random() * 9 + 1);

				boolean isDuplOk = true;
				for (int num : questionArr) {
					if (randomNum == num) {
						isDuplOk = false;
						break;
					}
				}
				if (isDuplOk == true) {
					questionArr[i] = randomNum;
					break;
				}
			}
		}
		for (int num : questionArr) {
			System.out.println(num);
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("3자리 정수를 입력하세요 : ");
		int inputNum = scan.nextInt();

		answerArr[0] = inputNum / 100;
		answerArr[1] = inputNum / 10 % 10;
		answerArr[2] = inputNum % 10;
		
		
	}

}
