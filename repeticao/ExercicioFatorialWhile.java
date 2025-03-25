import java.util.Scanner;

public class ExercicioFatorialWhile {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o fatorial desejado: ");
        int limite = scanner.nextInt();
        scanner.close();
        int contador = limite;
        int fatorial = 1;
        while (contador > 1) {
            fatorial *= contador;            
            contador--;
        }
        System.out.println("O fatorial de " + limite + " é " + fatorial);
    }
}
