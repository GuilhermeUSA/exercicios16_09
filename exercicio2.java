/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg16.pkg09;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class exercicio2 {
    
   public static void main (String [] args){ 
           
   double altura,peso;
    String sexo,h,m;
   Scanner s = new Scanner(System.in);  
   float resultado;
   
       System.out.println("\n Informe a altura:");
       altura = s.nextDouble();
       System.out.println("\n Informe o peso:");
       peso = s.nextDouble();
       System.out.println("Informe o Sexo:");
       sexo = s.next();
       if (!"h".equals(sexo)){
         resultado = (float)(72.7 * altura -58);
         System.out.println(resultado);
       }else if (!"m".equals(sexo)){
           resultado = (float)(62.1 * altura - 58);
           System.out.println(resultado);
       }else{
           System.out.println("Informe um Sexo valido!");
       }
      
       
 }
   
   
}   
   
   
   
   
   
   
   

