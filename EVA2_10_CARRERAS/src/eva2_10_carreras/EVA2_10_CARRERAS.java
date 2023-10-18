/*
        ISC
        INF
        LA
        ARQ
        IND
        IDI
        IGE




*/
package eva2_10_carreras;

import java.util.Scanner;

public class EVA2_10_CARRERAS {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String car;
       
      System.out.println("Introduce las iniciales de la carrera en mayúsculas que quieras saber el");
        car = sc.nextLine();
        
        switch(car){
        
            case "ISC":
                System.out.println("Ingenieria en sistemas computacionales");
                  break;
            case "INF":
                System.out.println("Ingenieria en informatica");
                  break;
            case "LA":
                System.out.println("Licenciatura en administración");
                  break;
            case "ARQ":
                System.out.println("Licenciatura en aquitectura");
                  break;
            case "IND":
                System.out.println("Ingenieria industrial");
                  break;
            case "IDI":
                System.out.println("Ingenieria en diseño industrial");
                  break;
            case "IGE":
                System.out.println("Ingenieria en gestión empresarial");
                  break;
        
        
        
        }
        
        
        
    }
    
}
