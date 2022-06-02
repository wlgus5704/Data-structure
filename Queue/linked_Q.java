import java.util.NoSuchElementException;

public class linked_Q { //백준과 세트

	
	private Node point; 
	private Node top; 
	
	public linked_Q() {
		top = null;
	}
	private class Node{
	private int data;   
	private Node next;   

	
	public  Node (int data){ 
		this.data = data;  
		this.next = null;
		} }
	
	Node gettopnext(){
		return top.next;
	}
	
	
	public int pop() { 
		if(top == null) 
			throw new NoSuchElementException(); 
		else {
			int item = top.data; 
			top = top.next; 
			return item;}}
	
	public void push(int item){  
		Node new_node = new Node(item); 
        if(top == null) {
        	top = new_node;}
        else {
        	Node temp = top;
        	while(temp.next!=null) {
        		temp = temp.next;
        	}
        	temp.next = new_node;
        }
        }

    public int top2() {
        if(top == null){
           throw new NoSuchElementException();
        	}
       return top.data; 
    }

    public void isEmpty(){ 
    	if (top == null)
    		System.out.println("Empty");} 
    	
    
    public void print_all() { 
    		if(top == null) {
    			System.out.println("Empty");} 
    		else {
    			point = top; 
    			while (point!= null) {
    				System.out.print(point.data + " ");
    				point = point.next;
    				} 
    			}}
    
  

  
	

	
    
}
