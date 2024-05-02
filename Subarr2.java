//Sum of all the possible subarrays
class Test{
    public static void main(String args[]){
        int a[] = {10,20,30};
        for(int i=0 ; i<a.length ; i++){
            int sum = 0;
            for(int j=i ; j<a.length ; j++){
                sum += a[j];
                System.out.print(sum + " ");
            }
            // System.out.println();
        }
    } 
}