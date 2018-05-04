import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        
        String texto = "";

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                texto+=" *    ";
            }
            texto+="\n";
        }

        JOptionPane.showMessageDialog(null, texto);

    }
    
}