import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int yun = sc.nextInt();
		
		if((yun % 4 == 0 && yun % 100 != 0)|| yun % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
		
	}

	
}
