class MyThread implements Runnable{
	Thread t;
	MyThread(){
		t = new Thread(this,"MyThread");
		System.out.println(t);
		t.start();
	}
	public void run(){
		try{
			for(int i=0 ; i<=3 ; i++){
				System.out.println("My Thread" + i);
				t.sleep(1500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("MyThread Exit");
	}
}

class Test{
	public static void main(String args[]){
		MyThread ob1 = new MyThread();
		try{
			for(int i=0 ; i<=3 ;i++){
				System.out.println("Main" + i);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Main Exit");
	}
}
		