import java.util.Scanner;

import javax.swing.JOptionPane;

public class EstruturaWhileSimples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;
        int contador=1;
        while (contador <=5) {
//            System.out.println("Digite o valor para iniciar a calculadora (formato ddd,d): ");
//            float valor = scanner.nextFloat();


            String stringNota1=JOptionPane.showInputDialog("Entre a primeira nota:");
            nota1 = Double.parseDouble(stringNota1);
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2"));
            JOptionPane.showMessageDialog(null,"A média é:" + (nota1+nota2)/2);
            contador = contador + 1;
        }
    }
}