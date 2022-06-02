import java.util.Scanner;
class search{
	search(){}
	
	void search(int arr[], int key){
	
			for(int i = 0; i<arr.length-1; i++) {
				System.out.println(i + "번째 탐색 값 : " +arr[i]);
				if(i+1 == arr.length-1) {
					System.out.println("탐색실패");}
				else if(key == arr[i]) {
					System.out.println("Index : " + i);
					System.out.println("탐색성공");
					break;}
				}
						
	}
	
	
	void print(int arr[]) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		search 개선 = new search();
		
		int size =1;
		if(size<100 && size>0) {
			size= (int)(Math.random()*100+1);} //size랜덤 생성
		
		int arr[] = new int[size];
		
		for(int i = 0; i<arr.length-1; i++) {
			int a =1;
			if(a<100 && a>0) {
				a= (int)(Math.random()*100+1);}
			arr[i] = a;} //배열 랜덤입력
		
		개선. print(arr);
		System.out.println();
		
		int key = sc.nextInt(); //찾을 key값 입력
		arr[arr.length-1] = key;
		개선.search(arr,key);
		
		sc.close();
	}

}
