/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class NodoParaPila {
    private DatoParaPila elemento;
    private NodoParaPila siguiente;

    public NodoParaPila(String nombre, String apellido, int FechaDeNacimiento,double nota) {
        this.elemento = new DatoParaPila(nombre, apellido, FechaDeNacimiento, nota);
        this.siguiente = null;
    }
    
    public DatoParaPila getElemento() {
        return elemento;
    }

    public void setElemento(DatoParaPila elemento) {
        this.elemento = elemento;
    }

    public NodoParaPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoParaPila siguiente) {
        this.siguiente = siguiente;
    }
    
}
