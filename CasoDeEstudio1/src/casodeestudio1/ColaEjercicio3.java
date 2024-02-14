/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class ColaEjercicio3 {
    private NodoColaEjercicio3 frente;
    private NodoColaEjercicio3 ultimo;

    public NodoColaEjercicio3 getFrente() {
        return frente;
    }

    public void setFrente(NodoColaEjercicio3 frente) {
        this.frente = frente;
    }

    public NodoColaEjercicio3 getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoColaEjercicio3 ultimo) {
        this.ultimo = ultimo;
    }
    
    public void hacerFila(String genero, String nombre)
    {
        DatoColaEjercicio3 auxDatoColaEjercicio3 = new DatoColaEjercicio3(genero,nombre);
        NodoColaEjercicio3 auxNodoColaEjercicio3 = new NodoColaEjercicio3(auxDatoColaEjercicio3);
        
        if(frente == null) // La fila está vacía
        {
            frente = auxNodoColaEjercicio3;
            ultimo = auxNodoColaEjercicio3;
        }
        else
        {
           
            ultimo.setAtras(auxNodoColaEjercicio3);
            ultimo = auxNodoColaEjercicio3;  
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
        NodoColaEjercicio3 actual = frente;
        
        while(actual != null)
        {
            //Podemos hacer el recorrido
            respuesta += actual.getDato() + " - ";
            actual = actual.getAtras();
        }
        
        return respuesta;
    }
    public void emparejar(String genero, String nombre){
       
    }
}
