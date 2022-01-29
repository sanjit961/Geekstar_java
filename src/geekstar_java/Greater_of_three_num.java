package geekstar_java;

public class Greater_of_three_num {
	public static void main(String[] args) {
//		System.out.print("Hello world!");
		int num1 = 300;
		int num2 = 5000; 
		int num3 = 1000;
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.print("The Greatest number is: "+num1);
			}else {
				System.out.print("The Greatest number is: "+num3);
			}
		}
		else {
			if(num2 > num3) {
				System.out.print("The Greatest number is: "+num2);
			}else {
				System.out.print("The Greatest number is: "+num3);
			}
		}
	}
	
}
