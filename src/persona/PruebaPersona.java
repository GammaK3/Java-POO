package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo persona");
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Layla","Acosta");
        System.out.println(objeto1);
        System.out.println("Variable estatica: " + Persona.contadorPersonas);

        //Segundo Objeto
        var objeto2 = new Persona("Ian","Gomez");
        System.out.println(objeto2);
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
   }
}
