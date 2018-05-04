import javax.swing.JOptionPane;

public class QuestaoX {

    public static void main(String[] args) {
        
        String texto = "";
        int finalLinha=21;

        for (int i = 0; i <finalLinha; i++) {
            for (int j = 0; j <=finalLinha; j++) {
                if (i==j||i+j==finalLinha) {
                    texto+="X   ";
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