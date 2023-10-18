package eva2_9_switch;

import java.util.Scanner;

public class EVA2_9_SWITCH {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
                 
              int mes;
                   
                   
        //Pedimos al usuario que introduzca el numero del mes
        System.out.println("Introduce el numero del mes que deseas saber el nombre");
            mes = sc.nextInt();
            
            switch(mes){
             
                case 1:
                    System.out.println("El mes "+ mes +" es enero");
                        break;//La palabra break termina el bloque que evalua el switch
                case 2:
                    System.out.println("El mes "+ mes +" es febrero");
                        break;
                case 3:
                    System.out.println("El mes "+ mes +" es marzo");
                        break;
                case 4:
                    System.out.println("El mes "+ mes +" es abril");
                        break;
                case 5:
                    System.out.println("El mes "+ mes +" es mayo");
                        break;
                case 6:
                    System.out.println("El mes "+ mes +" es junio");
                        break;
                case 7:
                    System.out.println("El mes "+ mes +" es julio");
                        break;
                case 8:
                    System.out.println("El mes "+ mes +" es agosto");
                        break;
                case 9:
                    System.out.println("El mes "+ mes +" es septiembre");
                        break;
                case 10:
                    System.out.println("El mes "+ mes +" es octubre");
                        break;
                case 11:
                    System.out.println("El mes "+ mes +" es noviembre");
                        break;
                case 12:
                    System.out.println("El mes "+ mes +" es diciembre");
                        break;
                default: 
                        System.out.println("El mes "+ mes +" no existe");
            }
            
            
           
            
            
            
    }
    
}
