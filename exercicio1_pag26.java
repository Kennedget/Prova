package Pag26;
import java.util.Scanner;

public class exercicio1_pag26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer b,h,B, area;
        System.out.println("Digite a altura: ");
        h = entrada.nextInt();
        System.out.println("Insira a base menor: ");
        b = entrada.nextInt();
        System.out.println("Insira a base maior: ");
        B = entrada.nextInt();

        area =(h*(b + B))/ 2;
        System.out.println("A área do trapézio é de: "+ area );
    }    
}