/**
 * 
 */

import java.util.*;

/**
 * 
 */
public class ContarCaracteres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String frase = args[0];
        
        HashMap<Character, Integer> mp = new HashMap<Character,Integer>();
        
        for ( Character c : frase.toCharArray()) 
        	if ( ! mp.containsKey(c))
        		mp.put(c, 1);
        	else {
        		int v = mp.get(c);
        		mp.put(c,v+1);
        	}
        
        System.out.printf("La frase leida fue:%s", frase);
        
        for ( Map.Entry<Character,Integer> e : mp.entrySet() )
        	System.out.printf("%c=%d\n", e.getKey(), e.getValue());
       
        // Podemos hacer con un arreglo, si podemos, solo que será un poco más engorroso 
	}
}


