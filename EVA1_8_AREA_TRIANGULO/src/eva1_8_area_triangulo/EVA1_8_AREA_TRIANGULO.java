
package eva1_8_area_triangulo;

import java.util.Scanner;


public class EVA1_8_AREA_TRIANGULO {

  
    public static void main(String[] args) {
       double base, altura, area;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digita la altura: ");
        altura = sc.nextDouble();
        System.out.println("Digita la base: ");
        base = sc.nextDouble();
         area = (base * altura)/2;
         
         System.out.println("\nEsta es el area del triangulo: " + area );
         
        
        
    }
    
}
