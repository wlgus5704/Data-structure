import java.util.Scanner;

class search2{
	search2(){}
	
	void print(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");}
	}
	
	public int Search(int arr[], int st, int end, int val) {
		int mid;
		while(st<=end) {
			mid = (st+end)/2;
			if(val == arr[mid]) {
				System.out.println(mid);
				System.out.println("Ž�� ����");
				return mid;
				}
			
			else if(val<arr[mid]) {
				end = mid-1;
				}
			
			else{
				st = mid+1;
			}}
		System.out.println("Ž�� ����");
		return -1;
		//Ž������
		}
}

public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		search2 ���� = new search2();
		
		
		int arr[] = new int[20];
		for (int i=0; i<arr.length; i++) {
			double a = Math.pow(2.0,i);
			arr[i] = (int)a;}
		
		����.print(arr); //�迭 print
		
		int n = sc.nextInt(); //ã�� �� �Է�
		sc.close();
		
		System.out.println();
		System.out.print("Index : ");
		
		����.Search (arr,0, arr.length-1,n);
		
	}

}
