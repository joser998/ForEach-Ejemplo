package test;
import entidad.Persona;
public class ForEachTest {
    public static void main(String[] args) {
        //Arreglo Unidimensional Entero
        int edades[] = {15, 20, 41, 50};
        for(int edad: edades){
            System.out.println(edad);
        }
        
        //Arreglo de Objetos -- Mandamos los parametros de tipo String al Constructor
        Persona personasArrayObjects[] = {new Persona("Jose"), new Persona("Dayanne")};
        
        
        /* For Each - Usamos la variable mostrar para que reciba todas los objetos del arreglo y los pueda mostrar
            despues por consola.
            
           El nombre de mi arreglo de objetos es: personasArrayObjects que son de tipo Persona, osea pertenecen a esta
                clase Persona.
           
           Presentamos los atributos de tipo String y el conteo que hace idPersona en el Constructor.   
        
           No se tiene un contador en For Each, como se tiene por ejemplo con el for normal. 
        */
        System.out.println("\nFor Each: ");
        for(Persona mostrar: personasArrayObjects){
            System.out.println(mostrar);
        }
        
        
        
        
        
    }
}
