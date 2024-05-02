import java.util.Scanner;
class Test{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	System.out.println("Hello");
	try{
		int c = a/b;
		System.out.println(c + "Bye");
	}
	catch(ArithmeticException e){
		System.out.println("Dont divide by 0");	
	}
	System.out.println("Bye");
	}
}

	