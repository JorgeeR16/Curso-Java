import java.util.Scanner;

public class PrimerosPasos {

    public static void main(String[] args) {
        
        try (Scanner Teclado = new Scanner(System.in)) {
            int Numero = (int) ((Math.random()) * 100);
            int conteo=0;
            int NumeroDigitado = 0;
            while (Numero != NumeroDigitado) {
                conteo++;
                System.out.println("Digite un numero");
                NumeroDigitado = Teclado.nextInt();
                
                if (Numero > NumeroDigitado) {
                    System.out.println("mas grande");
                } else if(Numero < NumeroDigitado) {
                    System.out.println("mas pequeño");
                }            
            }System.out.println("El " + NumeroDigitado + " es el correcto y fue encontrado en "+conteo+" veces");
        }
    }
}  