import java.util.Scanner;

class Queue{
	
	private int fpoint; //���������
	private int rpoint; //����������
	private int[] Qarray; 
	
	Queue(){}
	
	Queue(int size) { //Q�� �����ϴ� �޼ҵ�
		fpoint = 0;
		rpoint = 0;
		Qarray = new int[size];
	}
	
	public boolean isFull() { // ť�� ��ȭ �������� �˻��ϴ� �޼ҵ�
	    if (((rpoint + 1) % 5) == fpoint) { //rpoint�� fpoint�� ����Ų�ٸ� ��á��.
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean isEmpty() { // ť�� �̾��� �ִ��� �˻��ϴ� �޼ҵ�.
	    return rpoint == fpoint; // rear�� front�� �����Ͱ� ���ԵǱ� ������ ���� ��ġ�� ����Ŵ.
	}

	public void add(int i) {
   	 if (isFull()) { // ť�� ������ ���� �ʴٸ� ����.
	        System.out.println("Error : Array is Full");
	        print_all();
	     
	    }else {
	    	rpoint = (++rpoint) % 5; // ����ť�� �ٽ� rpoint�� 0���� ���ƿ;� �ϱ⶧���� ������ ������, �����ְ�, �迭ũ��� �����ش�.
	    	Qarray[rpoint] = i; // ���������� rpoint�� ����Ű�� ������ ������ �����Ѵ�.
	        System.out.println(i + "�� " + rpoint + "��°��" + " �����Ѵ�.");

	    }}

	
	   
	public int remove(int i) {
	    switch(i) {
		case 0:
			
			fpoint = (++fpoint) % 5;
			Qarray[fpoint] = 0;
		    System.out.println(Qarray[(fpoint) % 5] + "��°�� �����Ѵ�.");
		    return Qarray[fpoint];
		default:
			if (isEmpty()) {
			System.out.println("Empty");
			return -1;} 
		        }
	    return 0;
	}
	
	public void print_all() {
		for(int i = 0; i<Qarray.length; i++) {
			int n = Qarray[i];
			System.out.print(n + " ");
		}
	}
	

}
	
	

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Queue Q = new Queue(5);
		for(int i = 1; i<5; i++) {
			int in = sc.nextInt();
			Q.add(in);}
		Q.print_all();
		Q.add(sc.nextInt());
		Q.print_all();
		
		Q.remove(sc.nextInt());
		Q.print_all();
		
		Q.add(sc.nextInt());
		Q.print_all();
		
		
		sc.close();
	}

}
