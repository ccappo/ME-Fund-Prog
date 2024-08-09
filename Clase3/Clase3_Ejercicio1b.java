/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 2 - Ejercicio  1 utilizando parámetros de la linea de comandos
*
*  Resolver la ecuación cuadrática teniendo en cuenta solo el caso
*  de b^2 - 4ac > 0. No validamos esta situación 
*  
*  Leemos desde la linea de comandos.
*/
public class Clase3_Ejercicio1b {
    public static void main (String [] args ) {

        /* coeficientes */
        double a, b, c;
        /* valores de las raices */
        double x1, x2;

        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.printf("Las soluciones para a=%f b=%f c=%f son x1 =%f y x2=%f \n",a,b,c,x1,x2);

        System.out.printf("x1 = %f  y verifica que %.3fx^2 + %.3fx + %.3f = %.10f \n", x1, a,b,c, a*(x1*x1)+b*x1+c);
        System.out.printf("x2 = %f  y verifica que %.3fx^2 + %.3fx + %.3f = %.10f \n", x2, a,b,c, a*(x2*x2)+b*x2+c);
    
    }
}