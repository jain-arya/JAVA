class Test{
public static void main(String args){
int arr[]={3,5,6,9,1,2,7,8};
int inv = 0;
while(arr[i]>arr[j] && i<j){
inv++;
i++ ; j++;
}
System.out.println(inv);
}
}
