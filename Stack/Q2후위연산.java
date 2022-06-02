import java.util.Scanner;

class stackB{
	private int top; //top을 가르킬 변수 생성
	private static int size; //스택의 사이즈를 결정할 사이즈 변수 생성
	
	private char array[]; //배열 생성
	
	public stackB(int size){
        this.top = -1;
        stackB.size = size; 
        this.array = new char[stackB.size];
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
public class Q2후위연산 {
	
	public static boolean ischeck(char ca, char cb) {
		int a = num(ca);
		int b = num(cb);
		if(a >= b)
			return true;
		else
			return false;
	}
	
	public static int num (char i) {
		switch(i) {
			case '*':
			case '/':
				return 4;
			case '+':
			case '-':
				return 3;
			case'(':
				return 2;}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		stackB st = new stackB(str.length());
		String mod ="";
		sc.close();
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == '1' || ch == '2' || ch == '3' ||ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9')
				{mod = mod + ch; }
			else {
				switch(ch) {
				case'(':
					st.push(ch); break;
				case')':
					while(!st.isEmpty()) {
						if(st.top2() == '(') {
							st.pop();
							break;}
						mod += st.pop();}
				case'+':
				case'-':
				case'*':
				case'/':
					while(!st.isEmpty() && ischeck(st.top2(),ch)) {
							mod += st.pop();}
					st.push(ch); break;}}}
		if(st.top2() == '+' ||st.top2() == '-'||st.top2() == '*'||st.top2() == '/')
		{mod += st.top2();}
		
		System.out.println(mod);
		
}}
