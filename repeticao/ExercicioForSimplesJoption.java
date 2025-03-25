import javax.swing.JOptionPane;

public class ExercicioForSimplesJoption {
    public static void main(String[] args) {
        String saida = "";
        /* Primeira solução */
        /* 
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de repetições:"));
        for (int contador = 1; contador <= limite; contador++) {
            if (contador < limite) {
                saida = saida + contador + ",";
            } else {
                saida = saida + contador;
            }
        }
        JOptionPane.showMessageDialog(null, saida);
        */

        /* Segunda solução */
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de repetições:"));
        for (int contador = 1; contador < limite; contador++) {
            saida = saida + contador + ",";
        }
        saida = saida + limite;
        JOptionPane.showMessageDialog(null, saida);
    }
}
