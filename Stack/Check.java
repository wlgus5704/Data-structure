
 class Check {
	public static boolean check (String input) {
		linkedliststack StackL = new linkedliststack();
		
		for (char i : input.toCharArray()) { //input을 char로 바꿔서 i에 넣는다
			switch(i) {
				case '(':
				case '[':
				case '{':
					StackL.push(i);
					break;
				case ')':
				case ']':
				case '}':
					if(StackL.top2() =='{' ||StackL.top2() =='[' || StackL.top2() =='(') 
						{StackL.pop();}
					else
						{StackL.push(input.charAt(i));}
					break;}		
			}
			
		
		if (StackL.isEmpty()) {
			return true;
		}
		else
			return false;
	} }
