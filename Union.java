import java.util.*;
class Test{
    public static void main(String args[]){
        int a1[] = {7,3,9};
        int a2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        int a[] = new int[a1.length + a2.length];
        for(int i=0 ; i<a1.length ; i++ ){
            a[i] = a1[i];
        }
        for(int i=0 ; i<a2.length ; i++){
            a[i+a1.length] = a2[i];
        }
        for(int i=0 ; i<a.length ; i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
}