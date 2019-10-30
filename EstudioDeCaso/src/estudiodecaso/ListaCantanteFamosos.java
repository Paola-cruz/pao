/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiodecaso;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Cruzp
 */
class ListaCantanteFamosos {
           private ArrayList<CantanteFamoso>listaCantantesFamosos;

    public ListaCantanteFamosos() {
        this.listaCantantesFamosos = new <CantanteFamoso>ArrayList();
       
    }
   
    //método que permita añadir objetos de tipo CantanteFamoso a la lista
    public void añadirCantantesFamosos(){
        CantanteFamoso ca=new CantanteFamoso();
        listaCantantesFamosos.add(ca);
    }
   
    public void listarCantantesFamosos(){
        CantanteFamoso c;
        Iterator<CantanteFamoso>it=listaCantantesFamosos.iterator();
        while (it.hasNext()) {
            c = it.next();
            System.out.println("Cantante: "+ c.getNombre());
            System.out.println("Disco con más ventas:"+c.getDiscoConMasVentas());
        }
    }
   
    public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
        return listaCantantesFamosos;
    }

   
    public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        this.listaCantantesFamosos = listaCantantesFamosos;
    }
    public void setCantanteFamoso(CantanteFamoso Cantante){
        listaCantantesFamosos.add(Cantante);
    }
}
    



