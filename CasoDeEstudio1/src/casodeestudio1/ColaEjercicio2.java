/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class ColaEjercicio2 {
    private NodoColaEjercicio2 frente;
    private NodoColaEjercicio2 ultimo;

    public NodoColaEjercicio2 getFrente() {
        return frente;
    }

    public void setFrente(NodoColaEjercicio2 frente) {
        this.frente = frente;
    }

    public NodoColaEjercicio2 getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoColaEjercicio2 ultimo) {
        this.ultimo = ultimo;
    }
    
    public void hacerFila(String nombre, String tipo, int FechaDeNacimiento)
    {
        Animal auxAnimal = new Animal(nombre, tipo, FechaDeNacimiento);
        NodoColaEjercicio2 auxNodoColaEjercicio2 = new NodoColaEjercicio2(auxAnimal);
        
        if(frente == null) // La fila está vacía
        {
            frente = auxNodoColaEjercicio2;
            ultimo = auxNodoColaEjercicio2;
        }
        else
        {
           
            ultimo.setAtras(auxNodoColaEjercicio2);
            ultimo = auxNodoColaEjercicio2;  
        }
    }      
    
    public boolean esVacia(){
        if(frente == null && ultimo == null){
            return true;
        }else{
            return false;
        }
    }
     public String imprimirCola()
    {
        String respuesta = ""; // En esta respuesta vamos a ir concatenando los nodos, para poder imprimirlos juntos
        NodoColaEjercicio2 actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            respuesta += actual.getDato() + " - ";
            actual = actual.getAtras();
        }
        
        return respuesta;
    }
     public void interseccionTipoAnimal(String tipo){
     }
          
}
     
    

