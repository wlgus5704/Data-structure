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
				System.out.println("탐색 성공");
				return mid;
				}
			
			else if(val<arr[mid]) {
				end = mid-1;
				}
			
			else{
				st = mid+1;
			}}
		System.out.println("탐색 실패");
		return -1;
		//탐색실패
		}
}

public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		search2 이진 = new search2();
		
		
		int arr[] = new int[20];
		for (int i=0; i<arr.length; i++) {
			double a = Math.pow(2.0,i);
			arr[i] = (int)a;}
		
		이진.print(arr); //배열 print
		
		int n = sc.nextInt(); //찾을 값 입력
		sc.close();
		
		System.out.println();
		System.out.print("Index : ");
		
		이진.Search (arr,0, arr.length-1,n);
		
	}

}
