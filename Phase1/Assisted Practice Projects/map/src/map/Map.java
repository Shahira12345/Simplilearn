package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	public class Entry {

	}

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"shahira");    
	      hm.put(2,"subahan");    
	      hm.put(3,"shahirasbn");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"roopa");  
	      ht.put(5,"ravali");  
	      ht.put(6,"sreekanya");  
	      ht.put(7,"lakshmi");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	     
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"swetha");    
	      map.put(9,"thousif");    
	      map.put(10,"abbubakarsiddik");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

