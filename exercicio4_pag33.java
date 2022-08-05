package Pag33;

import java.util.Scanner;

public class exercicio4_pag33 {

    public static void main(String[]args){
        float valor, sal, hora ;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite as horas trabalhadas: ");
        hora = s.nextInt();
        valor = (10.25f);
        sal = (valor * hora);
        System.out.print("SALARIO: " + sal);
        
    }
    
}
