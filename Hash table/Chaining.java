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
            this.value = value;}} //Node class 끝!
    
    LinkedList<Node>[] lst;
    
    Chaining(int size){
        this.lst = new LinkedList[size];} 
    
   
    int HashCode(int key){
        int hashcode = 0;
            hashcode += key;
            return hashcode;}
        
    
    int get_Index(int hashcode){ //해시코드를 인덱스로 전환
        return hashcode % lst.length;}
    
    
    Node searchKey(LinkedList<Node> list, int key){ // 해당 key값에 연결리스트가 여러개일 경우
        if(list == null) 
        	return null;
        for (Node node:list){
            if (node.key == key){
                return node;}}
       
        return null;}  //못찾았으면 null 반환
    
  
    void put(int key, int value){ //데이터 넣기
        int hashcode = HashCode(key); 
        int index = get_Index(hashcode);
        System.out.println(key + " = Index : " + index);
        
        LinkedList<Node> list = lst[index]; //테이블에 연결해줄 리스트 생성
        if (list == null) {
            list = new LinkedList<Node>();
            lst[index] = list;}
        
       
        Node node = searchKey(list, key); //값넣어주기
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
        	System.out.println("없습니다.");
        	return 0;}
        else
        	return node.get_value();
        
    }


}
