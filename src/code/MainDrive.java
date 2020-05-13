package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 야구게임 - 이다연
		
		int[] questionArr = new int[3];
		
		for(int i=0; i < questionArr.length; i++) {
//			Math.random()
			
			while(true) {
				int randomNum = (int) (Math.random()*9+1);
				
				boolean isDuplOk = true;
				for (int num : questionArr) {
					if(randomNum == num) {
						isDuplOk = false;
					}
				}
				
				if(isDuplOk) {
					questionArr[i] = randomNum;
					break;
				}
//				중복이 되지 않아야 배열에 들어감
			}
		}
		
		for(int num:questionArr) {
			System.out.println(num);
		}
		
	}
	
}
