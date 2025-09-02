
import javax.swing.JOptionPane;

public class IfEncadeado {
    public static void main(String[] args) {
        double nota = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota do aluno:"));

        if (nota >= 7 && nota <=10) {
            JOptionPane.showMessageDialog
            (null, "O aluno tirou "+ nota + " e está aprovado!");
        } else if (nota <= 6.99 && nota >= 5.01) {
            JOptionPane.showMessageDialog
            (null, "O aluno tirou "+ nota + " e está de recuperação!");
        } else if (nota <= 5 && nota >= 0) {
            JOptionPane.showMessageDialog
            (null, "O aluno tirou "+ nota + " e está reprovado!");
        } else {
            JOptionPane.showMessageDialog
            (null, "Nota Invalida!");
        }
    }
}
