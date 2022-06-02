import java.util.LinkedList;

public class Chaining {
	
    class Node{
        int key;
        int value;

        public Node(int key, int value) { //Node base
            this.key = key;
            this.value = value;}
        
        int get_value(){
            return value;}
        
        void set_value(int value){
            this.value = value;}} //Node class ��!
    
    LinkedList<Node>[] lst;
    
    Chaining(int size){
        this.lst = new LinkedList[size];} 
    
   
    int HashCode(int key){
        int hashcode = 0;
            hashcode += key;
            return hashcode;}
        
    
    int get_Index(int hashcode){ //�ؽ��ڵ带 �ε����� ��ȯ
        return hashcode % lst.length;}
    
    
    Node searchKey(LinkedList<Node> list, int key){ // �ش� key���� ���Ḯ��Ʈ�� �������� ���
        if(list == null) 
        	return null;
        for (Node node:list){
            if (node.key == key){
                return node;}}
       
        return null;}  //��ã������ null ��ȯ
    
  
    void put(int key, int value){ //������ �ֱ�
        int hashcode = HashCode(key); 
        int index = get_Index(hashcode);
        System.out.println(key + " = Index : " + index);
        
        LinkedList<Node> list = lst[index]; //���̺� �������� ����Ʈ ����
        if (list == null) {
            list = new LinkedList<Node>();
            lst[index] = list;}
        
       
        Node node = searchKey(list, key); //���־��ֱ�
        if (node == null){
            list.addLast(new Node(key, value));}
        else{ 
            node.set_value(value);}
  }
    
    int search(int key){
        int hashcode = HashCode(key);
        int index = get_Index(hashcode);
        LinkedList <Node> list = lst[index];
        Node node = searchKey(list, key);
        if(node == null) {
        	System.out.println("�����ϴ�.");
        	return 0;}
        else
        	return node.get_value();
        
    }


}
