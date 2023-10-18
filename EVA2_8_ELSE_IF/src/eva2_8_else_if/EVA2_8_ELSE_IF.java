package eva2_8_else_if;

import java.util.Scanner;

public class EVA2_8_ELSE_IF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mes;
        //Pedimos al usuario que introduzca el numero del mes
        System.out.println("Introduce el numero del mes que deseas saber el nombre");
            mes = sc.nextInt();
            
       // if( (mes>0) && (mes<13) ){
            
                 if(mes ==1)
                System.out.println("El mes " + mes + " es enero");
            else if(mes == 2)
                System.out.println("El mes " + mes + " es febrero");
            else if(mes == 3)
                System.out.println("El mes " + mes + " es marzo");
            else if(mes == 4)
                System.out.println("El mes " + mes + " es abril");
            else if(mes == 5)
                System.out.println("El mes " + mes + " es mayo");
            else if(mes == 6)
                System.out.println("El mes " + mes + " es junio");
            else if(mes == 7)
                System.out.println("El mes " + mes + " es julio");
            else if(mes == 8)
                System.out.println("El mes " + mes + " es agosto");
            else if(mes == 9)
                System.out.println("El mes " + mes + " es septiembre");
            else if(mes == 10)
                System.out.println("El mes " + mes + " es octubre");
            else if(mes == 11)
                System.out.println("El mes " + mes + " es noviembre");
            else if(mes == 12){
                System.out.println("El mes " + mes + " es diciembre");
                     System.out.println("Es el cumple del profe!");
            }
                  else
                   System.out.println("El mes " + mes + " no existe!!!");
                 
        /*}else 
            System.out.println("El mes " + mes + " no es un mes válido!");
                 */
            
            
            
        
        
        
        
       
    }
    
}
