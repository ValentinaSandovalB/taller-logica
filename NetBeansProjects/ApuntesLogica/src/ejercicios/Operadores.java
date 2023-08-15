/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class Operadores { public static void main(String [] args){
        
        //Variables
        
       byte num1 = 127;
       short num2 = 32767;
       int num3 = 2147483647;
       long num4 = 9223372036854775807l;
      long num5 = 2147483647;
       float num6 = 4.556842f;
       double num7 = 5.46431645154354563;
       char caracter = 64;
       
         /*** Operadores Aritmeticos***/
        
        // +,-,/,% 
       
         int a;
        int b;
        int c;
        
        
        int d,e;
        
       
        a = 500;
        b = 400;
        c = 390;
        d= 510;
        e = 300;
        
      
        int puntosTotales = (a + b + c + d + e) ;      
        
       
        System.out.println("El total de puntos obtenidos por pepito es : " + puntosTotales);
        
        
      //a 
       int promedioPuntos = puntosTotales/5;
       int promPuntos = (a+b+c+d+e)/5;
       
       System.out.println(" promedio de Puntos es : " + promedioPuntos);
       System.out.println(" es igual : " + promPuntos);
       System.out.println("Valor de b antes de la resta "+ b);
       
       
      //b
      int sancion = 50;
      int bSinSancion = b;
      int cSinSancion = c;
      int bConSancion = b - sancion;
      int cConSancion = c - sancion;
      b = b - sancion;
      c = c - sancion;
      
      System.out.println("Puntos depues de sancion : " + b + " Puntos depues de sancion c : " + c);
      
      System.out.println("Valor de b despues de la resta "+ b);
      
     
    
      //c
      
      int pagoBono10 = ((a+b+c)/50) * 10000;
      int pagoBono15 = ((d+e)/50) * 15000; 
    
      int bonoTotal = pagoBono10 + pagoBono15;
      
      // cuanto dejo de percibir 
      
      int perdida = (((bSinSancion - b ) + (cSinSancion - c))/50) * 10000;
     
      System.out.println("La perdida es de : " + perdida); 
                
                
        
        
       
         
        
        
        
        
         
          
        
   
        
        
                
   
}
    
}
