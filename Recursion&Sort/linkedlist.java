import java.util.NoSuchElementException;


public class linkedlist {
//�ʿ���� pop�Լ��� top(peek)�Լ� �������� �ʾҽ��ϴ�.

	private Node top; //����� top�� ����ų ������
	
	
	private class Node{ //�������� ���� (��� base) Ŭ���� ����
	private int data;   //data�� ���� �ִ� ����
	private Node next;   //���� ���� �����ϴ� next ����
	
	public  Node (int data){ //node���� ���� �Է½�
		this.data = data;  //data�� �޴´�
		this.next = null;} }//�ڿ� �߰� �Ǵ� �����ʹ� �̾����� �ּҰ��� �����Ƿ� null

	
	public void push(int item){  //��ũ�帮��Ʈ�� ���� �ֱ����� �޼ҵ�
		Node new_node = new Node(item); //new��带 ����� ���⺻��Ŀ� data�� �ִ´�.
        if(top == null) { //top�� ���� ���ٸ� ���θ���� ���� new_node�� ����Ű�� �Ѵ�.
        	top = new_node;}
        else { //�װ� �ƴ϶��
        	Node temp = top; //temp�� top���� �����ϰ�
        	while(temp.next!=null) { //temp�� ���������� ��ġ�� �� �ְ� �ݺ����� ������.
        		temp = temp.next; //temp�� next�� �ٲ㼭 �ݺ����� ��� ���ư� �� �ְ� �Ѵ�.
        	}
        	temp.next = new_node; //�ݺ����� ����Ǹ� temp�� ���� �ּҰ� new node�� ����Ű�� �Ѵ�.
        }
        }
	

    public void isEmpty(){ //��ũ�帮��Ʈ�� ���� ������� Ȯ���ϴ� �޼ҵ�
    	if (top == null) //top�� ����Ű�� ���� ���ٸ� 
    		System.out.println("Empty");} //empty�� ����϶�.
    	
    private Node point; //top�� ��ġ�� ������ point���� ����
    public void print_all() { //��ũ�帮��Ʈ ��ü�� ������ִ� �Լ�
    	point = top; //point�� top���� �����Ѵ�.
    		if(point == null) { 
    			System.out.println("Empty");} //point�� null�ϰ�� empty�� ��ȯ�Ѵ�.
    		else {
    			while (point != null) { //point�� null�� �ƴҶ� ���� �ݺ����� ������.
    				System.out.print(point.data + " "); //point�� ����Ű�� �����͸� ����Ѵ�.
    				point = point.next;} //�������� ����ϱ� ���� point�� next�� �̵��Ѵ�.
			}} 
    
    
    private Node end; //����� end�� ����ų ������
    

    Node getTop() { //sort�� �Է��� ���� get
		return top;
	}

	Node getEnd() { //sort�� �Է��� ���� end
		Node temp = top;
    	while(temp.next!=null) {
    		temp = temp.next;}
    	end = temp;
		return end;
	}

	Node Parition(Node top, Node end) //sort���� Ȱ���� �޼ҵ� swap����
    {
        if (top == end || top == null || end == null)
            return top; //�������� �����ϸ� top�� ��ȯ�ϰ�,��!
 
        Node pivot_prev = top;  //���ҽ� Ȱ���� ���� 2�� ����
        Node cur = top;
        int pivot = end.data; //top.data�� ���� pivot����
        // end������ pivot���� ���� ����.
        
        while (top != end) { //top�� end�� ������ ���� ����Ű�� ������ �ݺ��Ѵ�.
        	//end�� ���� ������ �����Ƿ� while����
            if (top.data < pivot) { //pivot�� end.data �ΰ��� data��
            	//top�� data�� end data ���� �۴ٸ� 
               
            	//swap
                pivot_prev = cur;  //prev�� cur���� �־��ش�.
                int temp = cur.data; //temp�� �� cur�� �����͸� �־��ش�.
                cur.data = top.data;//cur�����͸� top�����ͷ� �ٲ۴�.
                top.data = temp; // top�����͸� temp�� �ִ´�.
                cur = cur.next;} //cur�� ���� ��ġ�� ����Ű�� �ٲ۴�.
                
            top = top.next; //top�����ͺ��� pivot�� ũ�ٸ� top�� ������ġ�� ����Ű�� �Ѵ�.
        }
        //swap
        int temp = cur.data; //temp�� cur�� �����͸� ��´�.
        cur.data = pivot; //cur�� end�����͸� �ִ´�.
        end.data = temp; // end�����Ϳ� temp�� ��´�.
        return pivot_prev;  //top�����Ͱ� �� ũ�ٸ� top�� ��ȯ
    }
 
    void Q_sort(Node top, Node end)
    {
        if(top == null || top == end|| top == end.next )
            return; //top�� null�̰ų� top�� end�� ���� ���ų� top�� end�� next�� return�Ѵ�.
        // top�� ����Ű�°� ����(����), top�� end�� ����(���� ����) top�� end.next�� ����(���� ����)
 

        Node pivot_prev = Parition(top, end); //pivot_prev �� �޼ҵ带 ������ ���� �޾ƿ´�.(partion���� swap�ؼ��� ) 
        Q_sort(top, pivot_prev); //top�� �޼ҵ带 ���� ���� prev�� ������.

       
        if (pivot_prev != null && pivot_prev == top)
            Q_sort(pivot_prev.next, end); 
        //prev�� null�� �ƴϰ� prev�� top�� ���ٸ� next�� �ٲ㼭 �޼ҵ� �ٽ� ����
 
      
        else if (pivot_prev != null
                 && pivot_prev.next != null)
            Q_sort(pivot_prev.next.next, end);
        //prev�� null�� �ƴϰ� prev�� next�� null�� �ƴ϶�� prev�� ���� ������ end�� �޼ҵ�� �ٽ� �����Ѵ�. 
    }
			
		
    
}
