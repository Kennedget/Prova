package Pag33;

import java.util.Scanner;

public class exercicio5_pag33 {

    public static void main(String[]args){
        float valor, salario, hora ;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite as horas trabalhadas: ");
        hora = s.nextInt();
        valor = (10.25f);
        System.out.println("");
        salario = (valor * hora);
        System.out.print(" SALARIO: " + salario);
        System.out.println("");
        if(salario < 50) {
            System.out.println("Por Favor, vá à direção do Hotel!");
        
    }
}
    
}
