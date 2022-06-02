import java.util.Scanner;

class InsertionSort{
	void Insertion_Sort (int[] arr) {
		int n =0;
		for(int i = 1; i<arr.length; i++) {
			int temp = arr[i];
			for(n = i-1; n>=0 && temp<arr[n]; n--) {
				arr[n+1] = arr[n];
				}arr[n+1] = temp;
	
				
			}}
	
		void show (int[] arr) {
			for (int i= 0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");}
			}
		
	}


public class »ðÀÔÁ¤·Ä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		InsertionSort sort = new InsertionSort();
		String str = sc.nextLine();
		sc.close();
		
		String[] arr = new String[str.length()];
		for (int i = 0; i<str.length(); i++) {
				arr = str.split(",");}
		
		int[] array = new int[arr.length];
		for (int i = 0; i<arr.length; i++) {
			array[i] = Integer.valueOf(arr[i]);
		}
		
		sort.Insertion_Sort(array);
		sort.show(array);
		
		
		
	}

}
