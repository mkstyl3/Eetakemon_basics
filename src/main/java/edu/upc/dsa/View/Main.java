package edu.upc.dsa.View;

/**
 * Created by $uperuser on 27/02/2017.
 */

import edu.upc.dsa.Controller.EetakemonManager;
import edu.upc.dsa.Model.Eetakemon;


public class Main {
    public static void main(String[] args) {

        //Creo los objetos para trabajar con ellos
        Eetakemon e = new Eetakemon();
        e.nombre = "Juan";
        e.tipo = "Fuego";
        e.nivel = 10;

        Eetakemon e2 = new Eetakemon();
        e2.nombre = "Toni";
        e2.tipo = "Agua";
        e2.nivel = 10;

        //Para acceder a la lista necesito crear un objeto Gestor
        EetakemonManager g = new EetakemonManager();

        //Añado 1 Eetakemon a la lista de Eetakemons
        g.addEetakemonToList(e);
        g.addEetakemonToList(e2);

        //Los imprimo por pantalla
        System.out.println("Los imprimo por pantalla");

        for (Eetakemon e3: g.getList()) {
            System.out.println(e3.nombre);
        }






    }
}
