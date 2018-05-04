import javax.swing.JOptionPane;

public class Questao04 {

    public static void main(String[] args) {
        
        String texto = "";
        int finalLinha=21;

        for (int i = 0; i <finalLinha; i++) {
            for (int j = 0; j <finalLinha; j++) {
                if (i==0 || i==finalLinha-1 ||j==0 || j==finalLinha-1) {
                    texto+="*   ";
                }else{
                    texto+="    ";
                }
            }
            texto+="\n";
        }

        JOptionPane.showMessageDialog(null, texto);
        System.out.println(texto);

    }
    
}