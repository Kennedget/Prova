package Pag33;

import java.util.Scanner;

public class exercicio3_pag33 {

     public static void main(String[]args){
        int i,numero; 
        int result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número: ");
        numero = s.nextInt();

          if(numero % 2 == 0) {
            System.out.println("PAR");
           } else System.out.println("IMPAR");

         
         
           for (i = 2; i <= numero / 2; i++) {
             if(numero % i == 0) {
                result++;
                break;
                   }
                 }
                   
                 if (result == 0)
                 System.out.println("PRIMO" );
                 else
                 System.out.println("NÃO PRIMO");
                 
                 
               
               }

    
}