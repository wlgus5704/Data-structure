import java.util.Scanner;

public class ����1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		linked_Q Josephus = new linked_Q();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 1; i<=N; i++) {
			Josephus.push(i);}
		
		System.out.println("��ü ���");
		System.out.print( "> ");
		Josephus.print_all();
		
		System.out.println();
		System.out.println("�似Ǫ�� ����");
		
		int j = 0;
		while(Josephus.gettopnext() != null) {
			for(int i = 0; i<K-1; i++) {
				int val = Josephus.pop();
				Josephus.push(val);
			}
			arr[j] = Josephus.pop();
			j +=1;
		}
		int len = arr.length;
		arr[len-1] = Josephus.top2();
		
		//Ȯ�� ���
		System.out.print("< ");
		for (int a = 0; a<N; a++) {
			System.out.print(arr[a] + " ");}
		System.out.println(">");
		
		
		
		
		sc.close();
	}

}
