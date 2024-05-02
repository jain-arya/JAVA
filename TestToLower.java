class Test{
public static void main(String args[]){
String s = "ARYA IS A BILLIONIER";
char ch;
for(int i=0 ; i<s.length() ; i++){
ch = s.charAt(i);
if(ch>=65 && ch<=90){
ch =((char)(ch + 32));
System.out.print(ch);
}
else
System.out.print(ch);
}
}
}