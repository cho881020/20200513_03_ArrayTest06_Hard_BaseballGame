package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 야구게임 - 구현정 
		int[] questionArr = new int[3];
		for(int i=0;i<questionArr.length;i++) {
			int randomNum = (int)(Math.random()*9+1);
			questionArr[i] = randomNum;
			
		}
		for(int num : questionArr) {
			System.out.print(num+" ");
		}
	}
	
}
