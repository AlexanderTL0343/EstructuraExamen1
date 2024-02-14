/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author User
 */
public class Pila {
     private NodoParaPila cima;

    public Pila() {
        this.cima = null;
    }
    
    public boolean esVacia()
    {
        if(cima == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void apilar(String nombre, String apellido, int FechaDeNacimiento,int nota)
    {
        //Insertar elementos en la pila
        NodoParaPila nuevo = new NodoParaPila(nombre, apellido, FechaDeNacimiento, nota);
        if(esVacia())
        {
            cima = nuevo;
        }
        else
        {
            nuevo.setSiguiente(cima); //Cada elemento nuevo, va a tener como siguiente a la cima actual
                                              
            cima = nuevo;
        }
    }
      public String imprimirPila()
    {
        String respuesta = ""; // En este string vamos a ir almacenando cada uno de los nodos de la pila
        
        if(!esVacia()) //Si la lista no es vacía la imprimimos
        {
            NodoParaPila auxiliar = cima; //Por cada nodo en el que me mueva, voy a guardar la referencia
            while(auxiliar != null) //Siempre y cuando el auxiliar no sea nulo
            {
                //Voy a seguir recorriendo la pila
                respuesta += auxiliar.getElemento().getNombre() + "\n"+auxiliar.getElemento().getApellido()+"\n"+auxiliar.getElemento().getFechaDeNacimiento()+ "\n"+auxiliar.getElemento().getNota()+ "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return respuesta;
       
    }
      //se crea este metodo para sumar todas la notas
      public double getTotal(NodoParaPila aux){
        double total=0;
        DatoParaPila auxDato= aux.getElemento();
        if(aux.getSiguiente()!=null){
            total= total + auxDato.getNota()+getTotal(aux.getSiguiente());
        }
         else{
            total= total + auxDato.getNota();
               
       }
        return total;
    }
      // se crea este metodo para poder saber la cantidad de gente que hay
    public double getGente(NodoParaPila aux){
        double total;
        if(aux.getSiguiente()!=null){
            total= 1+getGente(aux.getSiguiente());
        }
         else{
            total=1;
               
       }
        
        return total;
     }
    //este metodo divide la cantidad total de las notas entre la cantidad total de personas y lo divide entre si para lograr el promedio 
    public double  getpromedio(){
        double total=0;
        if(!esVacia()){
            total=getTotal(cima)/getGente(cima);
        }
        return total;
    }
}
