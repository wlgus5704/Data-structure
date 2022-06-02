import java.util.Scanner;

class Stack{
	private int top; //top을 가르킬 변수 생성
	private static int size; //스택의 사이즈를 결정할 사이즈 변수 생성
	
	private char array[]; //배열 생성
	
	public Stack(int size){
        this.top = -1;
        Stack.size = size; 
        this.array = new char[Stack.size];
    }
	
	
	public void push(char i) {
		if(isFull()) {
			System.out.println("Full");}
		else
			array[++top] = i;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Empty");
			return 0;}
		else {
			 char pop_item = top2();
			 array[top--] = 0;
        	return pop_item;}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull(){
        return (top == size-1);
    }
	
	public char top2(){
        if(isEmpty()) {}
        else
            return array[top];
        return 0;
    }


	
}
public class Q1배열스택 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		Stack A_Stack = new Stack(st.length());
		
		sc.close();
		try {
		for(int i = 0; i<st.length(); i++) {
			
		switch (st.charAt(i)) {
			case '(': 
			case '[': 
			case '{':
				A_Stack.push(st.charAt(i));
				break;
			case ')': 
			case ']': 
			case '}':
				if (A_Stack.top2() == '{' || A_Stack.top2() == '[' || A_Stack.top2() == '(' ) 
					A_Stack.pop();
				else {A_Stack.push(st.charAt(i));}
				break;}

				
				}
		
			
		
			if (A_Stack.isEmpty()) {
				System.out.println("Yes");}
				else {
					System.out.println("No");}}
			catch(java.util.EmptyStackException e) {
				System.out.println("No");} //예외처리를 통해 에러를 잡고 NO를 출력한다.
}}