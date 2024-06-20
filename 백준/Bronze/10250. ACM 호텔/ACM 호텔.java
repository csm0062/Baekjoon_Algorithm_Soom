import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 테스트 데이터 갯수
		int[] rooms = new int[T]; // 실제 배정되는 방을 담을 배열
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt(); // 호텔의 층 수
			int W = sc.nextInt(); // 각 층의 방 수
			int N = sc.nextInt(); // 몇 번째 손님인지
			
			int X = 1; // 실제 배정 방 번호
			int Y = 1; // 실제 배정 층 수
			
			while(N > H) {
				N -= H;
				X++;
			}
			
			Y = N;
			rooms[i] = 100 * Y + X;
		}
		
		for(int i : rooms) {
			System.out.println(i);
		}
		
		sc.close();
	}

}