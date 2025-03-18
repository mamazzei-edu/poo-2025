import javax.swing.JOptionPane;

public class IfSimples {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
        if (nota>=7.0){
            // System.out.println("Aprovado");
            JOptionPane.showMessageDialog(null,"Aprovado");
        }

    }
}