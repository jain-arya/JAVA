// Chennai -> Bengaluru
// Mumbai -> Delhi
// Goa -> Chennai
// Delhi -> Goa

import java.util.*;
class Test{
    public static void main(String args[]){
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai" , "Bengaluru");
        ticket.put("Mumbai" , "Delhi");    
        ticket.put("Goa" , "Chennai");    
        ticket.put("Delhi" , "Goa");   
        String start = getStart(ticket);  
        while(ticket.containsKey(start)){
            System.out.print(start + "-> ");
            start = ticket.get(start);
        }  
        System.out.println(start);
        System.out.print("You have reached your destination!!");
    }
    public static String getStart(HashMap<String,String>tick){
        HashMap<String,String> reverse = new HashMap<>();
        for(String key : tick.keySet()){
            reverse.put(tick.get(key) , key);
        }
        for(String key : tick.keySet()){
            if(!reverse.containsKey(key)){
                return key;
            }
        }
        return "";
    } 
}