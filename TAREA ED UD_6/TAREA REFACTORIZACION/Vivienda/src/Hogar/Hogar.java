
package Hogar;

/**
 * la clase Hogar (Hace uso de la clase 'Vivienda' e incluye al método main)
 * @author José Luis Escribano
 * @version 2.0 (modificado original aportado por tarea)
 */
public class Hogar 
{
    
    public static void main(String[] args) 
    {       
        
        Vivienda casa1 = new Vivienda(120000, 4, 135, true, "A estrenar", "Pepelu Linfosite");
        Vivienda casa2 = new Vivienda(190000, 3, 110, false, "Usada", "Pepito Grillo");
 
        imprimirVivienda(casa1);
        imprimirVivienda(casa2);
           
    }

    public static void imprimirVivienda(Vivienda casa1) {
        System.out.print("\n"+"Precio: " + casa1.getPrecio()+"\n"+
                         "Número de habitaciones: "+ casa1.getNumHabitaciones()+"\n" +
                         "Superficie en m2: " + casa1.getSuperficie()+"\n"+
                         "¿Dispone de parking?: " + casa1.isParking()+"\n"+
                         "Estado: "+ casa1.getEstado()+"\n"+
                         "Propietario: "+ casa1.getPropietario()+"\n");
                         
    }

}
