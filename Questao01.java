import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        
        int valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para fazer sua tabuada"));
        String texto = "Tabuada de "+valorDigitado+":";
        
        for (int i = 0; i < 11; i++) {
            texto+="\n"+i+" X "+valorDigitado+": "+(i*valorDigitado);
        }

        JOptionPane.showMessageDialog(null, texto, "Tabuada de valor digitado", JOptionPane.PLAIN_MESSAGE);

    }
    
}