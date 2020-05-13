package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 야구 게임 : 유혜원
		
		int[] questionArr = new int[3];
		 for (int i = 0; i< questionArr.length; i++) {
//			 0<=(int) (Math.random()*9+1)<10	//랜덤넘버남겨두기	
			 
			 int randomNum = (int) (Math.random()*9+1);
			 questionArr[i] =randomNum;
			 
		 }
		
		 for ( int num :questionArr ) {
			 System.out.println(num);
		 }
	}
	
}
