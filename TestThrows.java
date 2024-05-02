class Test{
    void division(int a , int b) throws ArithmeticException{
        int c;
        if(b==1){
            throw new ArithmeticException("/ by one");
        }
        else{
            c = a/b;
            System.out.println(c);
        }
    }

    public static void main(String args[]){
        Test t1 = new Test();
        try{
            t1.division(10,2);
            t1.division(10,1);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}