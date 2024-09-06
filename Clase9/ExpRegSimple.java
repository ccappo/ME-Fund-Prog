/**
 * 
 */

import java.util.regex.*;

public class ExpRegSimple {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]a{3}");

		Matcher m = p.matcher("aa baaa caaa aaaa abc");

		while (m.find())
			System.out.printf("Texto %s ini:%d fin:%d\n", 
					         m.group(), 
					         m.start(), 
					         m.end());
		

	}
}
