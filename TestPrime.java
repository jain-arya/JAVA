class Test
{
public static void main(String args[])
{
int n=11;boolean x = false;
for(int i=2 ; i<=n/2 ; i++){
if(n%i == 0){
x = true;
break;
}
}
if(x==true)
System.out.println("Non- prime");
else
System.out.println("Prime");
}
}

