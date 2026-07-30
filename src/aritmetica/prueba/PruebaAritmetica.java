package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("***Ejemplo aritmetica***");
        var aritmetica1 =new Aritmetica(5, 7);
        System.out.println("Atributo operando1:" +aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();

        //Segundo objeto
        System.out.println();
        var aritmetica2 = new Aritmetica(20,8);
        aritmetica2.sumar();
    }
}
