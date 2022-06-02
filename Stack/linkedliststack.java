import java.util.NoSuchElementException;

public class linkedliststack {

	private class Node{
	private char data;   //data를 갖고 있는 노드와
	private Node next;   //다음 노드와 연결하는 next
	
	public Node (char data){ //node설정
		this.data = data;  //data를 받는다
		this.next = null;} }//첫데이터는 가리키는 값이 없으므로 null로 설정
	
	public Node top; //노드의 top을 가리킬 노드생성
	
	public char pop() { //노드를 삭제할 pop 생성
		if(top == null) //노드 top에 아무값도 없다면
			throw new NoSuchElementException(); //null이뜨면 에러가 나기 때문에 에러처리를 해준다.
			//프로그램이 멈추지 않고 계속 가게 해준다.
		
		char item = top.data; //top.data(첫번째 노드)에 data를 (item)넣어준다.
		top = top.next; //없어진 원래의top을 next노드를 가리키게끔 해준다.
		return item;}//pop할때 내가 pop한 데이터를 반환한다.
	
	public void push(char item){  //push는 return값이 없기때문에 void, 사용자로부터 값을 받는다.
		Node new_node = new Node(item); //클래스 불러와서new item노드(data) 생성
        new_node.next = top; //top이 새로들어온 node의 next(주소)가 된다.
        top = new_node; // new node를 새로운top으로 변경해준다.
        }

    public char top2() {
        if(top == null){//top의 값이 null이라면
            throw new NoSuchElementException(); //예외처리를 해준다.
        } return top.data; //그게 아니라면 top에 있는 data를 보여준다.
    }

    public boolean isEmpty(){ 
    	if (top == null){
    		return true;} //짝이 완벽하다면 Yes라고 반환한다.
    	else
    		return false;} //그렇지 않다면 No를 반환한다.
}
