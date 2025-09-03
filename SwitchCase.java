import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        String operador = JOptionPane.showInputDialog("Digite a operação aritimetica:");
        int num1 = (int) Double.parseDouble (JOptionPane.showInputDialog("Digite o primeiro numero:"));
        int num2 = (int) Double.parseDouble (JOptionPane.showInputDialog("Digite o segundo numero:"));
        int resultado;

        switch(operador){
            
            case "+" -> {
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Soma " + resultado);
            }

            case "-" -> {
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Subitração " + resultado);
            }

            case "*" -> {
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Multiplicação " + resultado);
            }

            case "/" -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Divisão " + resultado);
                } else {
                    System.err.println("Erro: Divisão por ZERO!");
                }
            }

        }

    }

}
