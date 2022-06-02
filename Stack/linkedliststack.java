import java.util.NoSuchElementException;

public class linkedliststack {

	private class Node{
	private char data;   //data�� ���� �ִ� ����
	private Node next;   //���� ���� �����ϴ� next
	
	public Node (char data){ //node����
		this.data = data;  //data�� �޴´�
		this.next = null;} }//ù�����ʹ� ����Ű�� ���� �����Ƿ� null�� ����
	
	public Node top; //����� top�� ����ų ������
	
	public char pop() { //��带 ������ pop ����
		if(top == null) //��� top�� �ƹ����� ���ٸ�
			throw new NoSuchElementException(); //null�̶߸� ������ ���� ������ ����ó���� ���ش�.
			//���α׷��� ������ �ʰ� ��� ���� ���ش�.
		
		char item = top.data; //top.data(ù��° ���)�� data�� (item)�־��ش�.
		top = top.next; //������ ������top�� next��带 ����Ű�Բ� ���ش�.
		return item;}//pop�Ҷ� ���� pop�� �����͸� ��ȯ�Ѵ�.
	
	public void push(char item){  //push�� return���� ���⶧���� void, ����ڷκ��� ���� �޴´�.
		Node new_node = new Node(item); //Ŭ���� �ҷ��ͼ�new item���(data) ����
        new_node.next = top; //top�� ���ε��� node�� next(�ּ�)�� �ȴ�.
        top = new_node; // new node�� ���ο�top���� �������ش�.
        }

    public char top2() {
        if(top == null){//top�� ���� null�̶��
            throw new NoSuchElementException(); //����ó���� ���ش�.
        } return top.data; //�װ� �ƴ϶�� top�� �ִ� data�� �����ش�.
    }

    public boolean isEmpty(){ 
    	if (top == null){
    		return true;} //¦�� �Ϻ��ϴٸ� Yes��� ��ȯ�Ѵ�.
    	else
    		return false;} //�׷��� �ʴٸ� No�� ��ȯ�Ѵ�.
}
