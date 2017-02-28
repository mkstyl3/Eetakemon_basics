package edu.upc.dsa.Controller;

import edu.upc.dsa.Model.Eetakemon;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by $uperuser on 27/02/2017.
 */
public class EetakemonManager {
    private List<Eetakemon> eetakemonList = new ArrayList<Eetakemon>();

    public List<Eetakemon> getList() {
        return this.eetakemonList;
    }
    public void addEetakemonToList(Eetakemon e) {
        this.eetakemonList.add(e);
    }
    public void delEetakemonFromList(int id) {
        for(Eetakemon e: eetakemonList) {
            if (e.id == id) {
                eetakemonList.remove(e);
                break;
            }
        }
    }
    public List<Eetakemon> getEetakemonFromList (String nombre) {
        List<Eetakemon> resultado = new ArrayList<>();
        for(Eetakemon e: eetakemonList) {
            if (e.nombre.equals(nombre)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public List<Eetakemon> getEtakemonFromListbyNameAproximation (String aproximation) {
        List<Eetakemon> aproxList = new ArrayList<>();
        return aproxList;
    }
}
