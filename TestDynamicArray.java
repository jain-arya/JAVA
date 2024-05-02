import java.util.Scanner;
class Test{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0 ; i<a.length ; i++){
			System.out.println("Enter " + (i+1) + " no.");
			a[i] = s.nextInt();
		}
		System.out.println("You Entered");
		for(int i=0 ; i<a.length ; i++){
		System.out.println(a[i]);
		}
	}
}
