package Pag33;

public class exercicio2_pag33 {

    public static void main(String[] args) {  
        System.out.println("Esses são os numeros primos entre 1 a 123" );  
          for (int i = 2; i <= 123; i++) {
              if( Primo(i) )
                  System.out.println(i );
          }    
      }
    
      private static boolean Primo(int numero) {
          for (int j = 2; j < numero; j++) {
              if (numero % j == 0)
                  return false;   
          }
          return true;
      }
    
}
