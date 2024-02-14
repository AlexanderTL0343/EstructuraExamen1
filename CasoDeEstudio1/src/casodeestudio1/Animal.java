/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class Animal {
    // se asignan los atributos que se solicitan
    private String nombre;
    private String tipo;
    private int FechaDeNacimiento;
    
    // se crea un constructor para que sea mas facil anadir los  atributos a la hora de generar la cola
    public Animal(String nombre, String tipo, int FechaDeNacimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    //Se crean los setters and getters para la accesar la infirmacion del codigo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    
     @Override
    public String toString() {
        return nombre+" "+tipo+" "+FechaDeNacimiento;
    }

    
}
