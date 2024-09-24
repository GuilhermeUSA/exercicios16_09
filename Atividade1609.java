/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg16.pkg09;

import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author guilh
 */
public class Atividade1609 {
 static Calendar calendar = Calendar.getInstance();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     int mes;
     int mesatual = calendar.get(Calendar.MONTH)+1;
     
     Scanner s = new Scanner(System.in);
     System.out.print("Insira o mes");
     mes = s.nextInt();
     
     if(mes<1 || mes>12)
       System.out.print("Insira um mes valido!");
     
      if (mes == calendar.get(Calendar.MONTH)+1){
         System.out.print("e o mes atual!");
          }else if (mes < mesatual){
              System.out.print("O mes ja passou!");
             
             }else{
              System.out.print("e um mes futuro!");
          }
     }
     
     
     
    }
    

