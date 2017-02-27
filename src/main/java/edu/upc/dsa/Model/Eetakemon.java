package edu.upc.dsa.Model;

import edu.upc.dsa.Controller.EetakemonManager;

/**
 * Created by $uperuser on 27/02/2017.
 */
public class Eetakemon {
    public int id;
    public String nombre;
    public String tipo;
    public int nivel;

    static int ultimoId = 0;

    public Eetakemon () {
        this.id = ultimoId;
        ultimoId++;
    }
}
