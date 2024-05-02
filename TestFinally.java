class Test{
	public static void main(String args[]){
	int a =10 , b =0 , c , d[] = {10,20,30};
	try{
		try{
			c= a/b;
		}
		catch(ArithmeticException e){
		System.out.println("Dont divide by 0");
		}
		int u = d[5];
	}
	catch(ArithmeticException e){
		System.out.println("Dont divide by 0");
	}
	finally{
	      System.out.println("Bye");
		}
	}
}
