import java.util.Scanner;

public class 퀵정렬 { //linked list 클래스와 set입니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		linkedlist linked = new linkedlist(); //링크드리스트를 생성합니다.

		for (int i = 0; i<10; i++) { //배열에 값을 넣기위해 개수만큼 반복문을 실행합니다.
			int a = sc.nextInt(); //a에 스캐너로 숫자를 받습니다.
			if(a>0 && a<100) {// 1~99까지의 숫자라면 링크드리스트에 push 합니다.
				linked.push(a);}}
		sc.close();
		
		System.out.println("BEFORE");
	
		linked.print_all(); //정렬전 링크드 리스트를 출력합니다.
		
		System.out.println();
		System.out.println("AFTER"); 
		
	
		
		linked.Q_sort(linked.getTop(), linked.getEnd()); //퀵정렬로 정렬합니다
		linked.print_all(); //정렬후 링크드 리스트를 출력합니다.
	}

	
	
}
