import java.util.*;
class Test {
    public static void main(String args[]){
        int a[] = {10 , 2 , -2 , -20 , 10};
        int k = -10;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1); //Sum , Frequency 
        //This has been done for an empty sub array
        int ans=0 , sum=0;
        for(int i=0 ; i<a.length ; i++){
            sum += a[i];

            if(map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum , map.get(sum)+1);
            }
            else{
                map.put(sum , 1);
            }
        } 
        System.out.println(ans);
        System.out.println(map);
    }
}