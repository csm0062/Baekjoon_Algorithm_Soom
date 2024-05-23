import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int plusmin = sc.nextInt();
		
		int sum = 0;
		sum = (hour * 60) + min + plusmin;
		int h = 0;
		h = sum / 60;
		
		int m = 0;
		m = sum - (h * 60);
		
		
		if(h >= 24) {
			int s = (h - 24);
			System.out.println(s + " "+ m);
		}else {
			System.out.println(h + " "+ m);
		}
		
		
		
				
	;
		

	}
}
