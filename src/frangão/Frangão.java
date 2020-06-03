/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frangão;

/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class Frangão {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        //declaração de variaveis
        
        double chips, alimento, soma, A, B;
        
        Scanner ler = new Scanner(Systen.in);
        
         //Entrada de dados 
          
        System.out.println("Quantidade de Chips?");
        chips = ler.nextDouble();
        System.out.println("Quantidade de Anéis?");
        alimento = ler.nextDouble();
        
         //Calculos
         
         A = chips*4.00;
         B = alimento*3.50;
         soma = A+B;
         
         //saida de dados 
         
         System.out.println("Chips: R$"+A);
         System.out.println("Anéis: R$"+B);
         System.out.println("Total: R$"+soma);
    
    }
}