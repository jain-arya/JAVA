class AryaException extends Exception{
    String message;
    AryaException(String str){
        message = str;
    }
    public String toString(){
        return "java.lang.AryaException: " + message;
    }
}
class Test{
    public static void main(String args[]){
        int a=10 , b=1 , c;
        try{
            if(b==1){
                throw new AryaException("/ by one");
            }
            else{
                c = a/b;
                System.out.println(c);
            }
        }
        catch(AryaException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");
        }
    }
}