import java.util.NoSuchElementException;


public class linkedlist {
//필요없는 pop함수나 top(peek)함수 구현하지 않았습니다.

	private Node top; //노드의 top을 가리킬 노드생성
	
	
	private class Node{ //노드생성을 위한 (노드 base) 클래스 생성
	private int data;   //data를 갖고 있는 노드와
	private Node next;   //다음 노드와 연결하는 next 변수
	
	public  Node (int data){ //node설정 숫자 입력시
		this.data = data;  //data를 받는다
		this.next = null;} }//뒤에 추가 되는 데이터는 이어지는 주소값이 없으므로 null

	
	public void push(int item){  //링크드리스트에 값을 넣기위한 메소드
		Node new_node = new Node(item); //new노드를 만들어 노드기본양식에 data를 넣는다.
        if(top == null) { //top에 값이 없다면 새로만들어 놓은 new_node를 가리키게 한다.
        	top = new_node;}
        else { //그게 아니라면
        	Node temp = top; //temp에 top값을 복사하고
        	while(temp.next!=null) { //temp가 마지막값에 위치할 수 있게 반복문을 돌린다.
        		temp = temp.next; //temp를 next를 바꿔서 반복문이 계속 돌아갈 수 있게 한다.
        	}
        	temp.next = new_node; //반복문이 종료되면 temp의 다음 주소가 new node를 가리키게 한다.
        }
        }
	

    public void isEmpty(){ //링크드리스트의 값이 비었는지 확인하는 메소드
    	if (top == null) //top이 가리키는 값이 없다면 
    		System.out.println("Empty");} //empty를 출력하라.
    	
    private Node point; //top의 위치를 복사할 point변수 생성
    public void print_all() { //링크드리스트 전체를 출력해주는 함수
    	point = top; //point에 top값을 복사한다.
    		if(point == null) { 
    			System.out.println("Empty");} //point가 null일경우 empty를 반환한다.
    		else {
    			while (point != null) { //point가 null이 아닐때 까지 반복문을 돌린다.
    				System.out.print(point.data + " "); //point가 가리키는 데이터를 출력한다.
    				point = point.next;} //다음값을 출력하기 위해 point을 next로 이동한다.
			}} 
    
    
    private Node end; //노드의 end를 가리킬 노드생성
    

    Node getTop() { //sort시 입력을 위한 get
		return top;
	}

	Node getEnd() { //sort시 입력을 위한 end
		Node temp = top;
    	while(temp.next!=null) {
    		temp = temp.next;}
    	end = temp;
		return end;
	}

	Node Parition(Node top, Node end) //sort에서 활용할 메소드 swap구현
    {
        if (top == end || top == null || end == null)
            return top; //위조건이 만족하면 top을 반환하고,끝!
 
        Node pivot_prev = top;  //스왑시 활용할 변수 2개 생성
        Node cur = top;
        int pivot = end.data; //top.data와 비교할 pivot생성
        // end지점을 pivot으로 잡을 것임.
        
        while (top != end) { //top과 end가 동일한 곳을 가리키지 않으면 반복한다.
        	//end의 값은 편하지 않으므로 while가능
            if (top.data < pivot) { //pivot이 end.data 두개의 data비교
            	//top의 data가 end data 보다 작다면 
               
            	//swap
                pivot_prev = cur;  //prev에 cur값을 넣어준다.
                int temp = cur.data; //temp에 는 cur의 데이터를 넣어준다.
                cur.data = top.data;//cur데이터를 top데이터로 바꾼다.
                top.data = temp; // top데이터를 temp에 넣는다.
                cur = cur.next;} //cur을 다음 위치로 가리키게 바꾼다.
                
            top = top.next; //top데이터보다 pivot이 크다면 top을 다음위치를 가리키게 한다.
        }
        //swap
        int temp = cur.data; //temp에 cur의 데이터를 담는다.
        cur.data = pivot; //cur에 end데이터를 넣는다.
        end.data = temp; // end데이터에 temp를 담는다.
        return pivot_prev;  //top데이터가 더 크다면 top을 반환
    }
 
    void Q_sort(Node top, Node end)
    {
        if(top == null || top == end|| top == end.next )
            return; //top이 null이거나 top과 end의 값이 같거나 top이 end의 next면 return한다.
        // top이 가리키는게 없다(공백), top과 end가 같다(값이 없다) top이 end.next와 같다(값이 없다)
 

        Node pivot_prev = Parition(top, end); //pivot_prev 에 메소드를 실행한 값을 받아온다.(partion에서 swap해서옴 ) 
        Q_sort(top, pivot_prev); //top과 메소드를 통해 나온 prev를 돌린다.

       
        if (pivot_prev != null && pivot_prev == top)
            Q_sort(pivot_prev.next, end); 
        //prev가 null이 아니고 prev가 top과 같다면 next로 바꿔서 메소드 다시 실행
 
      
        else if (pivot_prev != null
                 && pivot_prev.next != null)
            Q_sort(pivot_prev.next.next, end);
        //prev가 null이 아니고 prev의 next가 null이 아니라면 prev의 다음 다음을 end를 메소드로 다시 실행한다. 
    }
			
		
    
}
