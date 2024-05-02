class Test{
	public static void main(String args[]){
	int a =10 , b=0 , c , d[] = {10,20,30};
	try{
	c = a/b;
	}
	catch(ArithmeticException z){
 	System.out.println("Dont divide by 0");
	}
	try{
	int u = d[5];
	}
	catch(ArrayIndexOutOfBoundsException v){
	System.out.println("String index is not in range");
	}
	catch(Exception e){
	System.out.println(e);
	}
	System.out.println("Bye");
	}
}
