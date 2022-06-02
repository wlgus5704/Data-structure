import java.util.Scanner;

class histogram{
		private int top; //top을 가르킬 변수 생성
		private static int size; //스택의 사이즈를 결정할 사이즈 변수 생성
		private int array[]; //배열 생성
		
		histogram(){}
		
		public void Stack(int size){
	        this.top = -1;
	        histogram.size = size; 
	        this.array = new int[histogram.size];
	    }
		
		
		public void push(int i) {
			if(isFull()) {
				System.out.println("Full");}
			else
				array[++top] = i;
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Empty");
				return 0;}
			else {
				 int pop_item = top2();
				 array[top--] = 0;
	        	return pop_item;}
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		
		public boolean isFull(){
	        return (top == size-1);
	    }
		
		public int top2(){
	        if(isEmpty()) {
	        	System.out.println("Empty");
	        }
	        else
	            return array[top];
	        return 0;
	    }
		
		int getsize() {
			return size;
		}

}

public class 히스토그램 {

	static int[] arr;	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		arr = new int[10];
		for(int i=1; i<9; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		histogram his = new histogram();
		his.push(0);
		int value =0;
		for(int i=1; i<arr.length; i++) {
			while(!his.isEmpty()) {
				int top = his.top2();
				if(arr[top] <= arr[i]) break;
				his.pop();
				value = Math.max(value, arr[top]*(i-his.top2()-1));
			}
			his.push(i);
		}
		System.out.println(value);
		
		
		sc.close();
	
}}
