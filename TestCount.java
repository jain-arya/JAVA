class Test{
public static void main(String args[]){
int space = 0,ch = 0;
String s = "Arya is a Billionier";
for(int i=0 ; i<s.length() ; i++){
if(s.charAt(i) == 32)
space++;
else
ch++;
}
System.out.println("Total Spaces = " + space);
System.out.println("Total Characters = " + ch);
}
}
