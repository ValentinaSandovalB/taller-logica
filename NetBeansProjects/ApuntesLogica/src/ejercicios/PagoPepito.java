/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class PagoPepito {
    
    public static void main(String [] args){
        
      

 
        int sueldo,auxilio,prestamo;
        
        int descuento1 = 64000;
        int descuento2 = 64000;
        prestamo = 160000;
           sueldo = 1250000;
        auxilio = 146000;
        
        int devengos = descuento1 + descuento2 + prestamo;
        
        System.out.println("devengos a pepito es :"  + devengos);
     
        int sueldoTotal = sueldo + auxilio;
        
        System.out.println("suelto total de pepito es : " + sueldoTotal);
        
        int sueldoApagar = sueldoTotal - devengos;
        
        System.out.println("Sueldo a pagar a pepito es : "+ sueldoApagar);
                
   
        
        
 
    
    }
    
}
