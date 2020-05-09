package entidad;

public class Persona {
    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    //Constructor
    //Inicializa el atributo String y cuenta las veces que se inicializa el idPersona
    public Persona(String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona: " + idPersona + ", nombre: " + nombre + '}';
    }
}
