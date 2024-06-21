import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCnt = sc.nextInt();
		sc.nextLine();
		
		int[] numArr = new int[numCnt];
		
		int sum = 0;
		
		String str = sc.nextLine();
		
		String[] strArr = str.split("");
		
		for(int i = 0; i < strArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		System.out.println(sum);

	}

}