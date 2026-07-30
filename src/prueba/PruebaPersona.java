package prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y pbjetos de tipo persona");
        var objeto1 = new Persona("Layla","Acosta");
        //objeto1.nombre = "Layla";
        //objeto1.apellido = "Acosra";
        objeto1.mostrarPersona();
        System.out.println();
        //Segundo objeto
        var objeto2 = new Persona();
        objeto2.setNombre("Ian");
        objeto2.setApellido("Gomez");
        objeto2.mostrarPersona();
    }
}
