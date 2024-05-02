class Test{
public static void main(String args[]){
String s = "Arya is a billionier";
for(int i=0 ; i<s.length() ; i++){
char ch = s.charAt(i);
if(ch>=97 && ch<=122){
System.out.print((char)(ch-32));
}
else{
System.out.print(ch);
}
}
}
}

