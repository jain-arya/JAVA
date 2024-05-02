class Test{

void add(int n , int ...a){
int sum=0;
for(int i=0 ; i<a.length ; i++){
sum = sum+a[i];
}
n+=sum;
System.out.println(sum);
System.out.println(n);
}

public static void main(String args[]){
Test t1 = new Test();
Test t2 = new Test();
t1.add(1,2,3);
t2.add(100,200,300,400,500);
}
}


