class Test
{
public static void main(String args[])
{
int i,j,k;
for(i=1 ; i<=5 ; i++){
for(j=4 ; j>=i ; j--)
System.out.print(" ");
for(k=1 ; k<=i ; k++)
System.out.print("*");

for(j=2 ; j<=i ; j++)
System.out.print("*");
for(k=4 ; k>=i ; k--)
System.out.print(" ");
System.out.println();
}
}
}