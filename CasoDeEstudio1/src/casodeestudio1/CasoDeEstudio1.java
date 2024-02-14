/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class CasoDeEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1 Pruebas
        // creamos una pila para poder almacenar los datos
        Pila nuevaPila = new Pila();
        nuevaPila.apilar("Fernado", "Kennedy", 01262007, 77);
        nuevaPila.apilar("Alfonso", "Gutierez", 02242006, 11);
        nuevaPila.apilar("Santiago", "Quesada", 03012005, 22);
        nuevaPila.apilar("Alexander", "Torres", 04152005, 33);
        nuevaPila.apilar("Marvin", "Gago", 05112007,44);
        nuevaPila.apilar("Isaac", "Lainez", 06302004, 55);
        nuevaPila.apilar("Andres", "Chavez", 07272003, 66);
        nuevaPila.apilar("Jordy", "Wild", 04102002, 88);
        nuevaPila.apilar("Randy", "Leiva", 05202005, 99);
        nuevaPila.apilar("Esteban", "Solis", 06312002, 100);
        //imprimimos la pila y el promedio
        System.out.println(nuevaPila.imprimirPila());
        System.out.println("El Promedio Es De:"+nuevaPila.getpromedio());
        // Ejercicio 2 pruebas
        ColaEjercicio2 colaA = new ColaEjercicio2();
        ColaEjercicio2 colaB = new ColaEjercicio2();
        
        colaA.hacerFila("Condor", "Ave", 10);
        colaA.hacerFila("Serpiente", "Reptil", 6);
        colaA.hacerFila("Almeja", "bivalvo", 8);
        
        colaB.hacerFila("Colibri", "Ave", 4);
        colaB.hacerFila("Iguana", "Reptil", 3);
        colaB.hacerFila("Navaja", "Bivalvo", 2);
        colaB.hacerFila("Perro", "Mamifero", 1);
        colaB.hacerFila("Sapo", "Anfibio", 9);
        
        System.out.println(colaA.imprimirCola());
        System.out.println(colaB.imprimirCola());

        // Ejercicio 3 pruebas
        ColaEjercicio3 cola1 = new ColaEjercicio3();
        cola1.hacerFila("Mujer", "Sofia");
        cola1.hacerFila("Hombre", "Ignacio");
        cola1.hacerFila("Mujer", "Zoila");
        cola1.hacerFila("Hombre", "Matias");
        cola1.hacerFila("Mujer", "Maria");
        cola1.hacerFila("Hombre", "Luis");
        cola1.hacerFila("Mujer", "Marta");
        cola1.hacerFila("Hombre", "Pedro");
        cola1.hacerFila("Mujer", "Xinia");
        cola1.hacerFila("Hombre", "kenneth");
        
        System.out.println(cola1.imprimirCola());
        


    }
    
}
