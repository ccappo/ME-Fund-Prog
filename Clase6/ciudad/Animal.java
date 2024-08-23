/**
 * 
 */
package ciudad;

/**
 * 
 */
public class Animal implements EmiteRuido {
    protected enum tipo {PERRO,GATO,LEON,SINDEFINIR}
    protected tipo tipoanimal;
    
    Animal () {
    	tipoanimal = tipoanimal.SINDEFINIR;  
    }
    
    Animal (tipo ta) {
    	tipoanimal = ta;
    }
    
    tipo getTipo() {
    	return tipoanimal;
    }

	@Override
	public void hacerRuido() {
	   System.out.println("Soy un animal pero no se cual");
	}
    
}
