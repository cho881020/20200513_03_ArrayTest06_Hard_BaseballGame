package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
		int[] questionArr =new int[3];		
		for(int i=0;i<questionArr.length;i++) {
			questionArr[i]=(int)(Math.random()*10+1);
		}
		for(int num:questionArr) {
			System.out.println(num);
		}
	}
	
}
