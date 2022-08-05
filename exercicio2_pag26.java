package Pag26;
import java.util.Scanner;

public class exercicio2_pag26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float b,h,B, area;
        System.out.println("Digite a altura: ");
        h = entrada.nextFloat();
        System.out.println("Insira a base menor: ");
        b = entrada.nextFloat();
        System.out.println("Insira a base maior: ");
        B = entrada.nextFloat();

        area =(h*(b + B))/ 2;
        System.out.println("Área exata do trapézio: " + area);
        System.out.println("Área arredondada do trapézio: "+ Math.round(area) );
    }    
    
}
