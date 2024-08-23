public class PruebaCirculo {
    public static void main ( String [] args ) {
         Circulo circulo1 = new Circulo(1.5);
         System.out.printf("El circulo de radio %f tiene área %f y perimetro = %f",
                            circulo1.radio, 
                            circulo1.obtenerArea(), 
                            circulo1.obtenerPerimetro());  

         /* modificamos el radio */
         circulo1.cambiarRadio(10);
  
         System.out.printf("El circulo de radio %f tiene área %f y perimetro = %f",
                            circulo1.radio, 
                            circulo1.obtenerArea(), 
                            circulo1.obtenerPerimetro());  
    
   }

}