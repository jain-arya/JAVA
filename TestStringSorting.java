class Test{
public static void main(String args[]){
String s[] = {"indore" , "india" , "dhar" , "bhind" , "dewas" , "ujjain"};
String temp;
for(int i=0 ; i<s.length -1 ; i++){
for(int j = i+1 ; j<s.length ; j++){
if((s[i].compareTo(s[j]))>0){
temp = s[i];
s[i] = s[j];
s[j] = temp;
}
}
}
for(int i=0 ; i<s.length ; i++){
System.out.print(s[i] + " ");
}
}
}
