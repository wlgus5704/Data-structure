import java.util.Scanner;
class search{
	search(){}
	
	void search(int arr[], int key){
	
			for(int i = 0; i<arr.length-1; i++) {
				System.out.println(i + "��° Ž�� �� : " +arr[i]);
				if(i+1 == arr.length-1) {
					System.out.println("Ž������");}
				else if(key == arr[i]) {
					System.out.println("Index : " + i);
					System.out.println("Ž������");
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
		search ���� = new search();
		
		int size =1;
		if(size<100 && size>0) {
			size= (int)(Math.random()*100+1);} //size���� ����
		
		int arr[] = new int[size];
		
		for(int i = 0; i<arr.length-1; i++) {
			int a =1;
			if(a<100 && a>0) {
				a= (int)(Math.random()*100+1);}
			arr[i] = a;} //�迭 �����Է�
		
		����. print(arr);
		System.out.println();
		
		int key = sc.nextInt(); //ã�� key�� �Է�
		arr[arr.length-1] = key;
		����.search(arr,key);
		
		sc.close();
	}

}
