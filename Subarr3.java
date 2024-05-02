//Print all possible subarrays
class Test{
    public static void main(String args[]){
        int a[] = {10,20,30,40,50,60};
        for(int i=0 ; i<a.length ; i++){
            for(int j=i ; j<a.length ; j++){
                for(int k=i ; k<=j ; k++){
                    System.out.println(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}