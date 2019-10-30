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
public class EstudioDeCaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCantanteFamosos listaDeCantantes1=new ListaCantanteFamosos();
       
        String opcion=new String();
        Scanner sc =new Scanner(System.in);
        char continuar;
       
        do{
           
            System.out.println("Por favor introduzca los datos de otro cantante.");

            System.out.println("Nombre :");
            EntradaTeclado entradaTeclado1=new EntradaTeclado();
            System.out.println("Disco con más ventas: :");
            EntradaTeclado entradaTeclado2=new EntradaTeclado();
           
           CantanteFamoso cantante=new CantanteFamoso();
            cantante.setNombre(entradaTeclado1.getEntradaTeclado());
            cantante.setDiscoConMasVentas(entradaTeclado2.getEntradaTeclado());
           
            listaDeCantantes1.añadirCantantesFamosos();
            listaDeCantantes1.setCantanteFamoso(cantante);
           
            System.out.println("La lista actualizada contiene los siguientes datos:");
            listaDeCantantes1.listarCantantesFamosos();
            System.out.println("¿Desea introducir los datos de otro cantante (s/n)?");
            opcion=sc.nextLine();
             continuar = opcion.charAt(0);
        }while(continuar=='s' || continuar=='S');
    }
   
}

    
    
