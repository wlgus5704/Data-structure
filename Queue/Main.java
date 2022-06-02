import java.util.Scanner;

class Queue{
	
	private int fpoint; //출력포인터
	private int rpoint; //삽입포인터
	private int[] Qarray; 
	
	Queue(){}
	
	Queue(int size) { //Q를 생성하는 메소드
		fpoint = 0;
		rpoint = 0;
		Qarray = new int[size];
	}
	
	public boolean isFull() { // 큐가 포화 상태인지 검사하는 메소드
	    if (((rpoint + 1) % 5) == fpoint) { //rpoint가 fpoint를 가리킨다면 꽉찼다.
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean isEmpty() { // 큐가 이어져 있는지 검사하는 메소드.
	    return rpoint == fpoint; // rear와 front는 데이터가 삽입되기 전에만 같은 위치를 가리킴.
	}

	public void add(int i) {
   	 if (isFull()) { // 큐가 가득차 있지 않다면 삽입.
	        System.out.println("Error : Array is Full");
	        print_all();
	     
	    }else {
	    	rpoint = (++rpoint) % 5; // 원형큐는 다시 rpoint가 0으로 돌아와야 하기때문에 데이터 삽입후, 더해주고, 배열크기로 나눠준다.
	    	Qarray[rpoint] = i; // 삽입포인터 rpoint가 가리키는 공간에 데이터 삽입한다.
	        System.out.println(i + "를 " + rpoint + "번째에" + " 삽입한다.");

	    }}

	
	   
	public int remove(int i) {
	    switch(i) {
		case 0:
			
			fpoint = (++fpoint) % 5;
			Qarray[fpoint] = 0;
		    System.out.println(Qarray[(fpoint) % 5] + "번째를 삭제한다.");
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
