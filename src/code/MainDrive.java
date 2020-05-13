package code;

public class MainDrive {

	public static void main(String[] args) {
		
		// 김하늬
		
		int[] question = new int[3];
		
		for(int i=0;i<question.length;i++) {
			while(true) {
				int random = (int) (Math.random()*9+1);
				
				boolean isOk = true;
				//중복 피해야져
				for(int num : question) {
					if(random == num) {
						isOk = false;
						break;
					}
				}
				if(isOk) {
					question[i] = random;
					break; //다음칸에 넣을 숫자를 구하기위해 나감
				}
			}
			
		}
		
		for(int num : question) {
			System.out.println(num);
		}
		
	}
	
}
