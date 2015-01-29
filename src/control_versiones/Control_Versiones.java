
package control_versiones;

import java.util.Scanner;


public class Control_Versiones {

    
    public static void main(String[] args) {
        int suma=0;
        System.out.println("Probando checkout revision");
        System.out.println("Mete dato");
        Scanner dato=new Scanner (System.in);
        suma=dato.nextInt();
        
        System.out.println("Se ha hecho un merge con la rama experimental");
        
        System.out.println("Nueva rama EXPERIMENTO2");
        for(int i=1;i<5;i++){
            suma=2+3;
        }
        System.out.println("Se suman dos numeros");
        //Vamos a crear una situacion de conflicto
        for(int i=0;i<5;i++){
            System.out.println(i+" --> "+(suma+i));
        }
        
    }
    
}
