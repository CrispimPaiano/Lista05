import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        
        for (int i = 1; i < 11; i++) {
            String texto = "Tabuada de "+i;
            for (int j = 0; j < 11; j++) {
                texto+="\n"+i+" X "+j+": "+(i*j);
            }
            JOptionPane.showMessageDialog(null, texto, "Tabuada de 1 à 10", JOptionPane.PLAIN_MESSAGE);
        }

    }
    
}