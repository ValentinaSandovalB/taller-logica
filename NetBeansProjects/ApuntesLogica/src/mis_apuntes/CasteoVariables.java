/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariables {
    
    public static void main(String [] args){
    
     int a, b, c, suma, resta, multi, div;
     a = 4;
     b = 10;
     
     suma = a+b;
     resta = a-b;
     multi = a*b;
     div = b/a;
     
     
     System.out.println(" El resultado de la suma es : " + suma);
      System.out.println(" El resultado de la resta es : " + resta);
      System.out.println(" El resultado de la multiplicacion es : " + multi);
       System.out.println(" El resultado de la division es : " + div);  
        
        // para evitar que se pierda informacion con la division 
        
        float divFloat = (float) b/a;
        
        System.out.println(" El resultado exacto de la division es : " + divFloat );
        
        //1 ingrese altura 
        
        int altura, largo;
        
        altura = 5;
       
        
        // ingrese largo
        
          largo = 5;
        
        
        // multiplique largo por alto para tener el area
        int area = altura * largo;
        
       
        
        
        
        // escriba el resultado 
        
         System.out.println(" El area es de : " + area);
        
    
       
    }
    
}
