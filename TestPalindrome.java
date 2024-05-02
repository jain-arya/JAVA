class Test
{
public static void main(String args[])
{
int i =151,r ,sum =0,temp = i;
while(i!=0){
r=i%10;
sum = sum*10 + r;
i=i/10;
}
if(sum == temp)
System.out.println("Palindrome");
else
System.out.println("Non-palindrome");
}
}
