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
public class Exercicio3 {

public static void main (String [] args){    
 Scanner s = new Scanner(System.in);
 double val;
 int cod;
 double resultado;
    System.out.println("Informe o valor total da compra: ");
    val = s.nextDouble();
    System.out.println("""
                       Informe o codigo de pagamento a seguir:1 - A vista com 10% de desconto
                       2 - A prazo, 1 parcela  com 8% de desconto
                       3 - A prazo, 5 parcelas sem desconto ou acr\u00e9scimos
                       4 - A prazo, 10 parcelas com acr\u00e9scimo  de 5% no valor total. """);
     cod = s.nextInt();
    
    
    switch(cod){
       case 1:
                resultado = val - (val * 10 / 100);
                System.out.println("Valor final com 10% de desconto: " + resultado);
                break;

            case 2:
                resultado = val - (val * 8 / 100);
                System.out.println("Valor final com 8% de desconto: " + resultado);
                break;

            case 3:
                resultado = val / 5;  // 5 parcelas sem desconto
                System.out.println("Valor de cada parcela (5x sem desconto): " + resultado);
                break;

            case 4:
                resultado = (val + (val * 5 / 100)) / 10;  // 10 parcelas com acréscimo de 5%
                System.out.println("Valor de cada parcela (10x com acréscimo de 5%): " + resultado);
                break;

            default:
                System.out.println("Código de pagamento inválido.");
                break;
        }
    }
 
    
    
}


