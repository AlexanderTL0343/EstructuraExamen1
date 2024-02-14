/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class DatoParaPila {
    private String nombre;
    private String apellido;
    private int FechaDeNacimiento;
    private double nota;
    
    // se crea un constructor para que sea mas facil anadir los  atributos a la hora de generar la cola
    public DatoParaPila(String nombre, String apellido, int FechaDeNacimiento,double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.nota=nota;
    }
    //Se crean los setters and getters para la accesar la infirmacion del codigo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return nombre+" "+apellido+" "+FechaDeNacimiento+" "+nota;
    }

    
    
}
