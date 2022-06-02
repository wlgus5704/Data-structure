import java.util.ArrayList;

	class Node<K, V> {
		K key;
		V value;
		Node<K, V>next;
		
		public Node(K key,V value) {
			this.key = key;
			this.value = value;}
	}
	
	class Hashtable<K, V> {
		private ArrayList<Node<K,V>> arr;
		private int num;
		private int size;
		
		public Hashtable() {
			arr = new ArrayList<>();
			num = 13;
			size = 0;
			
			for(int i =0; i<num; i++) {
				arr.add(null);}
		}
		
		int size() {
			return size;}
		
		boolean isEmpty() {
			return size() == 0;}
		
		public int Hashcode(K key) {
			 int hashcode = 0;
	            hashcode += (int)key;
	          int index = hashcode%num;
	          index = check_value(index);
	          Node<K, V> ex = arr.get(index); 
	            if (ex != null) {
	            	index+=1;}
	            return index;}
		
		int check_value(int index) {
			int n = index;
	        while (n!=size){
	        	Node<K, V> ex = arr.get(n);
	            if (ex == null) {
	            	break;}
	            else {
	            	n+=1;
	            	if(n>=size) {
	            		n = 0;}}
	            }
	        return n;
	      		}
		
		public V remove(K key) {
			int index = Hashcode(key);
			Node<K,V> top = arr.get(index);
			Node<K,V> prev = null;
			while(top!=null) {
				if(top.key == key) {
					break;}
				prev = top;
				top = top.next;}
			if(top == null)
				return null;
			
			size--;
			
			if(prev != null)
				prev.next = top.next;
			else
				arr.set(index,top.next);
			return top.value;
		}
		
	public V get(K key){
	        int index = Hashcode(key);
	        Node<K, V> top = arr.get(index);

	        while (top != null) {
	            if (top.key == key)
	                return top.value;
	            top = top.next;}
	        return null;
	    }
		
	
	public void add(K key, V value) {
		int index = Hashcode(key);
		Node<K,V> top = arr.get(index);
		System.out.println(key + " = Index : " + index);
		while(top != null) {
			if(top.key == key) {
				return;}
			top = top.next;}
		
		size++;
		top = arr.get(index);
		  Node<K, V> newNode = new Node<K, V>(key, value);
	        newNode.next = top;
	        arr.set(index, newNode);

	        if ((1.0*size)/num >= 0.9){
	            ArrayList<Node<K, V>> temp = arr;
	            arr = new ArrayList<>();
	            num = 2 * num;
	            size = 0;
	            for (int i = 0; i < num; i++)
	                arr.add(null);

	            for (Node<K, V> topNode : temp){
	                while (topNode != null){
	                    add(topNode.key, topNode.value);
	                    topNode = topNode.next;}}}
	}      
	
	void print() {
		for(Node<K, V> i :arr) {
			if(i == null) {
				System.out.print(0 + " "); }
			else
			System.out.print(i.key + " ");} 
	}

	}
