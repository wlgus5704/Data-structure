import java.util.Scanner;

public class ������ { //linked list Ŭ������ set�Դϴ�.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		linkedlist linked = new linkedlist(); //��ũ�帮��Ʈ�� �����մϴ�.

		for (int i = 0; i<10; i++) { //�迭�� ���� �ֱ����� ������ŭ �ݺ����� �����մϴ�.
			int a = sc.nextInt(); //a�� ��ĳ�ʷ� ���ڸ� �޽��ϴ�.
			if(a>0 && a<100) {// 1~99������ ���ڶ�� ��ũ�帮��Ʈ�� push �մϴ�.
				linked.push(a);}}
		sc.close();
		
		System.out.println("BEFORE");
	
		linked.print_all(); //������ ��ũ�� ����Ʈ�� ����մϴ�.
		
		System.out.println();
		System.out.println("AFTER"); 
		
	
		
		linked.Q_sort(linked.getTop(), linked.getEnd()); //�����ķ� �����մϴ�
		linked.print_all(); //������ ��ũ�� ����Ʈ�� ����մϴ�.
	}

	
	
}
