class Test{
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Arya's Thread");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(t.MAX_PRIORITY);
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		try{
			for(int i=0 ; i<=5 ; i++){
				System.out.println(i);
				t.sleep(2000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Bye");
	}
}

