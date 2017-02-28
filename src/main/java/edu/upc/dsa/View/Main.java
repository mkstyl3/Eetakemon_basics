package edu.upc.dsa.View;

/**
 * Created by $uperuser on 27/02/2017.
 */

import edu.upc.dsa.Controller.EetakemonManager;
import edu.upc.dsa.Model.Eetakemon;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Creo una Lista auxiliar para la funcion getEetakemonFromListByName
        List<Eetakemon> eetakemons;

        //Creo los objetos para trabajar con ellos
        Eetakemon e = new Eetakemon();
        e.nombre = "Juan";
        e.tipo = "Fuego";
        e.nivel = 10;

        Eetakemon e2 = new Eetakemon();
        e2.nombre = "Toni";
        e2.tipo = "Agua";
        e2.nivel = 10;

        Eetakemon e3 = new Eetakemon();
        e3.nombre = "Lluis";
        e3.tipo = "Tierra";
        e3.nivel = 10;

        Eetakemon e4 = new Eetakemon();
        e4.nombre = "Juan";
        e4.tipo = "Ghost";
        e4.nivel = 10;


        //Para acceder a la lista necesito crear un objeto Gestor
        EetakemonManager g = new EetakemonManager();

        //Añado 1 Eetakemon a la lista de Eetakemons
        g.addEetakemonToList(e);
        g.addEetakemonToList(e2);
        g.addEetakemonToList(e3);


        //Los imprimo por pantalla
        System.out.println("Los imprimo por pantalla:");
        for (Eetakemon f : g.getList()) {
            System.out.println(f.nombre);
        }

        System.out.println("");

        System.out.println("Borro al Eetakemon Toni");
        g.delEetakemonFromList(1);

        System.out.println("");

        //Los imprimo por pantalla
        System.out.println("Los vuelvo a imprimir por pantalla:");
        for (Eetakemon f : g.getList()) {
            System.out.println(f.nombre);
        }
        System.out.println("");

        //Muestrame info del Eetakemon "Juan"

        System.out.println("Busco los Eetakemons que se llamen \"Juan\" de la lista y printo sus atributos:");
        eetakemons = g.getEetakemonFromList("Juan");
        for (Eetakemon f : g.getList()) {
            if (f.nombre.equals("Juan")) {
                eetakemons.add(f);
            }
        }for (Eetakemon f: eetakemons) {
            System.out.println("Id: "+f.id);
            System.out.println("Nombre: "+f.nombre);
            System.out.println("Tipo: "+f.tipo);
            System.out.println("Nivel: "+f.nivel);
            System.out.println("");
        }


    }
}
