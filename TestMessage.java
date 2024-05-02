class Test{
	String message;
	Test(String s){
		message = s;
	}
	public String toString(){
		return message;
	}
public static void main(String args[]){
	Test t1 = new Test("Hello");
	Test t2 = new Test("Arya");
	System.out.println(t1);
	System.out.println(t2);
	}
}