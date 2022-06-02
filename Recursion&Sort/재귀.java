import java.util.Scanner;

class hanoi{
	private char A,B,C;
	private int number;
	
	void set_number(int number) {
		this.number = number;
	}
	char getA() {
		this.A = 'A'; 
		return A;
	}
	char getB() {
		this.B = 'B';
		return B;
	}
	char getC() {
		this.C = 'C';
		return C;
	}
	int get_number() {
		return number;
	}

	public void hanoitop(char a, char b, char c, int num) {
		if (num == 1) {
			System.out.println("���� "+num+"�� " + a+ "���� "+c+"�� �ű��.");
			return;}
		else {
			hanoitop(a,c,b,num-1);	 
			System.out.println("���� " + num +"�� "+a + "���� "+ c+"�� �ű��.");
			hanoitop(b,a,c,num -1);
		}	
					
		
			}


		
	
}

public class ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		hanoi top = new hanoi();
		top.set_number(sc.nextInt());
		top.hanoitop(top.getA(), top.getB(), top.getC(),top.get_number());
		
		sc.close();
	}

}
