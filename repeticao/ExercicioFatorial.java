import javax.swing.JOptionPane;

public class ExercicioFatorial {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int fatorial = 1;
        for (int contador = 1; contador <= numero; contador++) {
            fatorial *= contador;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
    }
}
