package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 김정민
		
		int[] questionArr = new int[3];
		
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
		
	}
	
}
