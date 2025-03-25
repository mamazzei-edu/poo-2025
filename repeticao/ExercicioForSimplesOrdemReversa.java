import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioForSimplesOrdemReversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de números: ");
        int limite = scanner.nextInt();
        scanner.close();
        // int limite = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números"));
        /*
        for (int contador = limite; contador >= 1; contador--) {
            System.out.print(contador + ", ");
        }
        */
        for (int contador = limite; contador > 1; contador--) {
            System.out.print(contador + ", ");
        }
        System.out.print(1);
    }
}
