package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 김하늬
		
		int[] question = new int[3];
		
		for(int i=0;i<question.length;i++) {
			
			int random = (int) (Math.random()*9+1);
			
			question[i] = random;
		}
		
		for(int num : question) {
			System.out.println(num);
		}
		
	}
	
}
