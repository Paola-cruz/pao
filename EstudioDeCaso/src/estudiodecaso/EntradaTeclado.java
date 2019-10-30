/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiodecaso;

import java.util.Scanner;

/**
 *
 * @author Cruzp
 */
class EntradaTeclado {
        private String entradaTeclado;

    public EntradaTeclado() {
        Scanner sc= new Scanner(System.in);
       
        this.entradaTeclado = sc.nextLine();
    }

    /**
     * @return the entradaTeclado
     */
    public String getEntradaTeclado() {
        return entradaTeclado;
    }

    /**
     * @param entradaTeclado the entradaTeclado to set
     */
    public void setEntradaTeclado(String entradaTeclado) {
        this.entradaTeclado = entradaTeclado;
    }
   
}



    

