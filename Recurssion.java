// Reverse a String using recurssion
class Test{
    public static void reverse(String str , int n){
        if(n<0){
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str , n-1);
    }
    public static void main(String args[]){
    String input = "ABCD";
    int n = input.length()-1;
    reverse(input,n);
    }
}