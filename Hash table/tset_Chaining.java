
public class tset_Chaining { //Chaining이랑 세트입니다!

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chaining hash = new Chaining(5);
		hash.put(45, 100);
		hash.put(9, 200);
		hash.put(10, 300);
		hash.put(96, 400);
		hash.put(25, 500);
        System.out.println(hash.search(45));
        System.out.println(hash.search(9));
        System.out.println(hash.search(10));
        System.out.println(hash.search(96));
        System.out.println(hash.search(25));
		
		
	}

}
