/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 5 - Ejemplo de clase  
*
*  Definir la clase Circulo.
*  
*/

public class Circulo {
    double radio = 1;

    Circulo() {
        radio = 0;
    }

    Circulo(double r) {
        cambiarRadio(r);
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void cambiarRadio(double r) {
        radio = r;
    }
    
}

